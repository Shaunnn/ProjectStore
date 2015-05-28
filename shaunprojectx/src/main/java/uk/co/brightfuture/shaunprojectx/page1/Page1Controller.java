package uk.co.brightfuture.shaunprojectx.page1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Page1Controller {
	@RequestMapping("/page1")
	public String Page1() {
		return "page1/page1";
	}
}