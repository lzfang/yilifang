package com.yilifang.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class BaseController {
	protected Logger logger=Logger.getLogger(BaseController.class);
	protected final int SUCCES=200;
	protected final int ERROR=500;
	protected Map<String,Object> result=new HashMap<>();
	
	
	
}
