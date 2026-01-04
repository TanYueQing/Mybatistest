package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class DemoController {
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {

        String realPath = request.getServletContext().getRealPath("/static/upload");
        if(null!=file){
            String path=realPath+ File.separator+file.getOriginalFilename();
            file.transferTo(new File(path));
        }

        return "upload done!";
    }
}
