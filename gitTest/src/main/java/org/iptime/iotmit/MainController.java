package org.iptime.iotmit;

// ���� �� ���� ���α׷�

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/strcount")
	public void aaa() {
		// "/strcount.jsp"�� �̵�
	}
	
	@PostMapping("/strcount")
	public String bbb(String content, Model model) {
		model.addAttribute("count", content.replaceAll(" ", "").replaceAll("\r\n", "").length());
		return "count";
	}

}
