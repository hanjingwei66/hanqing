package com.hanqing.project.controller;

import com.hanqing.project.service.IAccountService;
import com.hanqing.project.dto.LoginDTO;
import com.hanqing.project.service.IResourceService;
import com.hanqing.project.vo.ResourceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("auth")
public class Login {
    @Autowired
    private IAccountService iAccountService;
    @Autowired
    private IResourceService iResourceService;
    /**
     * 用户登陆
     */
    @PostMapping("login")

    public String  loginFirst(String username, String password, HttpSession session,
                              RedirectAttributes redirectAttributes, Model model){

        LoginDTO login = iAccountService.login(username, password);
        if (login.getError()==null){
            session.setAttribute("account",login.getAccount());
            List<ResourceVO> resourceVOS = iResourceService.listResourceById(login.getAccount().getRoleId());
            model.addAttribute("resources",resourceVOS);
        }else {
            redirectAttributes.addAttribute("error",login.getError());
        }
        return login.getPath();
    }
    @GetMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
