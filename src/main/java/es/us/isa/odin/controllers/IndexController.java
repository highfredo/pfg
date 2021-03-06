package es.us.isa.odin.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import es.us.isa.odin.controllers.common.AbstractController;
import es.us.isa.odin.domain.Document;
import es.us.isa.odin.domain.FooEntity;
import es.us.isa.odin.repositories.DocumentRepository;


@Controller
@RequestMapping("/welcome")
public class IndexController extends AbstractController {

	//@Value("${msg}")
	//private String msg;
	
	//@Autowired
	//private DocumentRepository repository;

	@RequestMapping(value = "/index")
	public ModelAndView index(@RequestParam(defaultValue = "hola mundo") String q) {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("q", q);
		//modelAndView.addObject("msg", msg);
		return modelAndView;
	}
	
	@RequestMapping(value = "/index2")
	@ResponseBody
	public String index2(@RequestParam(defaultValue = "hola mundo") String q) {
		return q;
	}
	
//	@RequestMapping(value = "/save")
//	public ModelAndView save(@RequestParam(defaultValue = "hola mundo") String q) {
//		ModelAndView modelAndView = new ModelAndView("index");
//		modelAndView.addObject("q", q);
//		//modelAndView.addObject("msg", msg);
//		
//		FooEntity foo = new FooEntity();
//		foo.setBar(q);
//		Document<FooEntity> doc = new Document<>();
//		doc.setEntity(foo);
//		repository.save(doc);
//		return modelAndView;
//	}

}