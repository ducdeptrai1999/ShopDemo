package com.buiminhduc.controller.admin;

import com.buiminhduc.common.constant.CRUD;
import com.buiminhduc.model.response.PageResponse;
import com.buiminhduc.model.response.UserResponse;
import com.buiminhduc.paging.PageRequest;
import com.buiminhduc.repository.UserRepository;
import com.buiminhduc.repository.impl.RoleRepositoryImpl;
import com.buiminhduc.repository.impl.UserRepositoryImpl;
import com.buiminhduc.service.UserService;
import com.buiminhduc.service.impl.RoleServiceImpl;
import com.buiminhduc.service.impl.UserServiceImpl;
import com.buiminhduc.service.session.SessionUtil;
import com.buiminhduc.util.FormUtil;

import javax.jws.soap.SOAPBinding;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.Normalizer;

@WebServlet("/admin-table")
public class TableController extends HttpServlet {
    private UserService userService;
    private UserRepository userRepository;
    public TableController() {
        this.userService = new UserServiceImpl();
        this.userRepository = new UserRepositoryImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PageResponse pageResponse = FormUtil.toModel(PageResponse.class, request);
        String url = "";
        if (pageResponse.getType().equalsIgnoreCase(String.valueOf(CRUD.LIST))){
            pageResponse.setTotalItem((int) userRepository.count());
            pageResponse.setTotalPage((int) Math.ceil((double) pageResponse.getTotalItem() / pageResponse.getMaxPageItem()));
            PageRequest pageRequest = new PageRequest(pageResponse.getPage(), pageResponse.getMaxPageItem());
            pageResponse.setListResult(userRepository.findAll(pageRequest,"user_name","asc"));
            request.setAttribute("model",pageResponse);
            url= "/views/admin/account/table.jsp";
        }else if (pageResponse.getType().equalsIgnoreCase(String.valueOf(CRUD.EDIT))){
            String id = request.getParameter("id");
            if (id != null){
                UserResponse userResponse = userService.finById(Integer.valueOf(id));
                request.setAttribute("userResponse",userResponse);
            }
            url="/views/admin/account/edit.jsp";
            request.setAttribute("model",pageResponse);
            request.setAttribute("role", new RoleRepositoryImpl().findAll());
        }
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
