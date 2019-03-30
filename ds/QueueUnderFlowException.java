package com.regnant.ds;

@SuppressWarnings("serial")
public class QueueUnderFlowException extends Exception{
	QueueUnderFlowException(String msg) {
		super(msg);
	}

}
