package com.demo.utilities;

public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static LoadPropertiesFiledata configFileReader;

	private FileReaderManager() {
	}

	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }

	 public LoadPropertiesFiledata getConfigReader() {
		 return (configFileReader == null) ? new LoadPropertiesFiledata() : configFileReader;
	 }
}
