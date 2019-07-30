package com.example.boot.control;

import com.example.boot.model.User;
import com.example.boot.service.UserService;
import com.example.boot.utils.RedisUtils;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.Topic;
import java.util.*;
import java.util.function.Consumer;

@Controller
@RequestMapping(value = {"view", "add"}, method = RequestMethod.POST)
@SessionAttributes
public class UserContro {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * Logger实例
     */
    static final Logger logger = LoggerFactory.getLogger(UserContro.class);

/*    @Autowired
    private JmsMessagingTemplate jms;

    @Autowired
    private ActiveMQQueue queue;

    @Autowired
    private ActiveMQTopic topic;*/

    @Autowired
    private UserService userService;

    @Autowired
    private User user;

    @GetMapping(value = "/{id}")

    public String get(@PathVariable("id") String id, Model model) {
        logger.info("id   " + id);
        Map map = new LinkedHashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put("key" + i, "value" + i);
        }
        model.addAttribute("list", Arrays.asList("string1", "string2", "string3", "string4", "string5", "string6"));
        model.addAttribute("map", map);
        model.addAttribute("name", "   htTps://wWw.zHyD.mE   ");
        model.addAttribute("htmlText", "<span style=\"color: red;font-size: 16px;\">html内容</span>");
        model.addAttribute("num", 123.012);
        model.addAttribute("null", null);
        model.addAttribute("dateObj", new Date());
        model.addAttribute("bol", true);

       /* redisTemplate.opsForValue().set("one", "test ");
        jms.convertAndSend(queue, "queue");
        jms.convertAndSend(topic, "topic");*/
      /*jmsMessagingTemplate.setDefaultDestinationName("one");
        jmsMessagingTemplate.convertAndSend("我是所有的");*/
      logger.info(user.getName());
        return "su";
    }

  /*  //指定containerFactory  就可以 收到topic信息
    @JmsListener(destination = "publish.topic",containerFactory = "jmsListenerContainerTopic")
    public void consumerMsg(String msg){
        System.out.println(msg);
    }

    @JmsListener(destination = "publish.queue")
    public void consumerMsgOne(String msg){
        System.out.println(msg);
    }*/
}
