package Test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class MessageAction extends ActionSupport implements ServletRequestAware {
    private String loginName;
    private String loginPwd;
    private HttpServletRequest request;
    @Override
    public void setServletRequest(javax.servlet.http.HttpServletRequest request) {
        this.request=request;
    }

    @Override
    public String execute() throws Exception {
        ActionContext ac=ActionContext.getContext();
        Map session=ac.getSession();
        if(getLoginName().equals("欧世乐")&&getLoginPwd().equals("oushile")){
            session.put("LOGIN_USER",getLoginName());
            ac.put("success","登陆成功，通过ActionContext类访问Servlet API");
            request.setAttribute("messageAware","Hello,通过xxxAware接口访问Servlet API");
            return "success";
        }else{
            ac.put("error","用户名或者密码错误,登录失败");
            ServletActionContext.getRequest().setAttribute("messageSAC","Hello,通过ServletActionContext类直接访问Servlet API");
            return "error";
        }
    }



    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }
}
