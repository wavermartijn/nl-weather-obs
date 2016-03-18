package org.waver.dutchobs;

/*
 * Note: These examples use the old version 1 Java netCDF interface,
 * which we do not recommend for new development. Instead, please use
 * NetCDF Java Library (Version 2), which is more efficient, simpler,
 * and provides better support for remote access using HTTP or
 * DODS. Similar examples are available in the NetCDF Java (version 2)
 * User's Manual.
 */


import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ucar.ma2.Array;
import ucar.ma2.IndexIterator;
import ucar.nc2.Attribute;
import ucar.nc2.NCdumpW;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;


/**
 * Simple example to read data from an existing netCDF file of known structure,
 * corresponding to the following CDL (created by the CreateNetcdf.java demo):
 * <pre>
 *  netcdf example1 {
 *  dimensions:
 *  	lat = 2 ;
 *  	lon = 3 ;
 *  	time = UNLIMITED ;
 *  variables:
 *  	int rh(time, lat, lon) ;
 *              T:long_name="relative humidity" ;
 *  		T:units = "percent" ;
 *  	double T(time, lat, lon) ;
 *              T:long_name="surface temperature" ;
 *  		T:units = "degC" ;
 *  	float lat(lat) ;
 *  		lat:units = "degrees_north" ;
 *  	float lon(lon) ;
 *  		lon:units = "degrees_east" ;
 *  	int time(time) ;
 *  		time:units = "hours" ;
 *  // global attributes:
 *  		:title = "Example Data" ;
 *  data:
 *  }
 * </pre>
 *
 * @author: Russ Rew
 * @version: $Id: ReadNetcdf.java,v 1.10 1999/02/03 21:18:01 russ Exp $
 */
public class ReadNetcdf {

    static String fileName = "example.nc"; // name of existing file to read

    /** 
     * Reads an existing netCDF file with a specified file name or
     * the default if no file name is specified.  
     *
     * @param args name of netCDF file to be read, if other than default
     * @throws IOException 
     * @throws ParseException 
     */
    public static void main(String[] args) throws IOException, ParseException {
    	//File netcdfFile = new File(new URL("https://data.knmi.nl/download/Actuele10mindataKNMIstations/1/noversion/2016/03/07/KMDS__OPER_P___10M_OBS_L2.nc"));
    	NetcdfFile netcdfFile = NetcdfFile.open("https://data.knmi.nl/download/Actuele10mindataKNMIstations/1/noversion/2016/03/02/KMDS__OPER_P___10M_OBS_L2.nc");
    	Variable v =netcdfFile.findVariable("time");
    	Array data = v.read();
    	for (int i=0; i<data.getSize(); i++){
    		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse("1950-01-01 00:00");
    		Date theDateInUTC = new Date(date.getTime()+data.getLong(i)*1000);
    		System.out.println("time "+i+" = "+data.getLong(i)+" or "+data.getLong(i)/(60*60*24)+" days after 1950.....theDate = "+theDateInUTC);
    	}
    	final CharArrayWriter buffer=new CharArrayWriter();
    	  final PrintWriter writer=new PrintWriter(buffer);
    	  NCdumpW.print(netcdfFile,writer,true,false,false,false,null,null);
    	 // final String expected=TestData.readText(NetcdfCoverageWriterTest.class,cdlFile);
    	  String actual=buffer.toString();
    	  actual=actual.substring(actual.indexOf('{'));
    	  actual=actual.replace("\n\n","\n");
    	  System.out.println("actual "+actual.substring(actual.indexOf("data:")));
    }

}