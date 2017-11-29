package ssm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.demo.service.IService;

@Controller  
@RequestMapping(value = "/") 
public class TSSController {

	@Autowired
	private IService serviceImpl;

	@RequestMapping(value = "/testssm", produces = "text/html;charset=UTF-8")
	@ResponseBody
	private String testSSM() {
		String json = serviceImpl.getData();
		return json;
	}
}
