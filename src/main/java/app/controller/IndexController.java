package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kaixu on 2018/1/12.
 *
 * 各省份中奖情况： http://www.zhcw.com/ssq/kaijiangshuju/index.shtml
 */
@Controller
public class IndexController {
    /**
     * 登录页
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 主页
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }


    /**
     * messages
     * @return
     */
    @RequestMapping("/messages")
    public String messages(){
        return "messages";
    }
    /**
     * tasks
     * @return
     */
    @RequestMapping("/tasks")
    public String tasks(){
        return "tasks";
    }
    /**
     * form
     * @return
     */
    @RequestMapping("/ui")
    public String ui(){
        return "ui";
    }
    /**
     * form
     * @return
     */
    @RequestMapping("/form")
    public String form(){
        return "form";
    }



    @RequestMapping("/blue01")
    public String blue01(){
        return "blue01";
    }
    @RequestMapping("/blue02")
    public String blue02(){
        return "blue02";
    }
    @RequestMapping("/blue03")
    public String blue03(){
        return "blue03";
    }
    @RequestMapping("/blue04")
    public String blue04(){
        return "blue04";
    }
    @RequestMapping("/blue05")
    public String blue05(){
        return "blue05";
    }
    @RequestMapping("/blue06")
    public String blue06(){
        return "blue06";
    }
    @RequestMapping("/blue07")
    public String blue07(){
        return "blue07";
    }
    @RequestMapping("/blue08")
    public String blue08(){
        return "blue08";
    }
    @RequestMapping("/blue09")
    public String blue09(){
        return "blue09";
    }
    @RequestMapping("/blue10")
    public String blue10(){
        return "blue10";
    }
    @RequestMapping("/blue11")
    public String blue11(){
        return "blue11";
    }
    @RequestMapping("/blue12")
    public String blue12(){
        return "blue12";
    }
    @RequestMapping("/blue13")
    public String blue13(){
        return "blue13";
    }
    @RequestMapping("/blue14")
    public String blue14(){
        return "blue14";
    }
    @RequestMapping("/blue15")
    public String blue15(){
        return "blue15";
    }
    @RequestMapping("/blue16")
    public String blue16(){
        return "blue16";
    }

    /**
     * 主页
     * @return
     */
    @RequestMapping("/carrier")
    public String indexCarrier(){
        return "carrier/index";
    }


    /**
     * 蓝球统计
     * @return
     */
    @RequestMapping("/blue/count")
    public String blueCount(){
        return "blue_count";
    }

    /**
     * 蓝球走势图
     * @return
     */
    @RequestMapping("/blue/trend")
    public String blueTrend(){
        return "week_test";
    }



    /**
     * 权限不足错误页面
     * @return
     */
    @RequestMapping("/403")
    public String error(){
        return "error/403";
    }
}
