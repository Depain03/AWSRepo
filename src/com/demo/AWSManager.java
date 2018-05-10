package com.demo;

import java.util.ArrayList;

import com.demo.AWSOperations.AWSOperations;
import com.demo.CSV.CSVOperations;
import com.demo.pojo.S3MetaPojo;

public class AWSManager {

	public static void main(String[] args) {
		ArrayList<S3MetaPojo> list=AWSOperations.getS3MetaData();
		CSVOperations.writeCSV(list);
		

	}

}
