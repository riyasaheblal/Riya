package com.fed.sl.job;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;

import com.fed.sl.service.FileProcessImpl;
import com.fed.sl.util.CommonLogger;

public class ScheduleJobs {

/*	@Autowired
	ValiadtingFiles validate;

	public ValiadtingFiles getValidate() {
		return validate;
	}

	public void setValidate(ValiadtingFiles validate) {
		this.validate = validate;
	}

	@Autowired
    DocumentServiceImpl documents;
	
	public DocumentServiceImpl getDocuments() {
		return documents;
	}

	public void setDocuments(DocumentServiceImpl documents) {
		this.documents = documents;
	}
	
	@Autowired
	ColumnMapServiceImpl columns;

	public ColumnMapServiceImpl getColumns() {
		return columns;
	}

	public void setColumns(ColumnMapServiceImpl columns) {
		this.columns = columns;
	}
*/
	final static CommonLogger logger=CommonLogger.getLogger();
	
	@Autowired
	FileProcessImpl fileProcess;
	public FileProcessImpl getFileProcess() {
		return fileProcess;
	}


	public void setFileProcess(FileProcessImpl fileProcess) {
		this.fileProcess = fileProcess;
	}

	public void pollFiles() throws ParseException, IOException{
		logger.info("hello job invoking");
		logger.debug("in debug");
		System.out.println("hello job invoking");
		
		fileProcess.validateFile();
		
	}

}
