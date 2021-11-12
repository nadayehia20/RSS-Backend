package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
        	
          Student data1= new Student(
                  "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOPJvR-kaQcRrzFQikt6g94ZSNoXHAW1vtrDuHuzHROHyf6RWRAiL-Y1BRWnVZShZEmT8&usqp=CAU",
                  "React",
                  "React makes it painless to create interactive UIs. Design simple views for each state in your application, and React will efficiently update and render just the right components when your data changes.",
                  "https://reactjs.org/",
                  "Facebook",
                  "Today",
                  2,
                  "https://lh3.googleusercontent.com/proxy/QBm_IzMf-zRHygH9K2izRw6bBNHPvIQ3awFHJUBICWW7FX12CQTxE3nCDcURNBGk9vSxrqWYMsgXvyfWtG10DxLvUZCmHOyOAviyZz-bTVgjaFXG98hh4D-qNbvN"
          );

            Student data2= new Student(
            		
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Intel_logo_%282006-2020%29.svg/1005px-Intel_logo_%282006-2020%29.svg.png",
                    "Intel",
                     "At Intel, we’re setting a new standard for corporate responsibility, enacting meaningful change throughout our entire global network.",
                    "https://www.intel.com/content/www/us/en/company-overview/company-overview.html",
                    "Intel",
                    "Today",
                     2,
                    "https://pbs.twimg.com/media/EroTbmSXYAIBNHG.jpg"
            		
            		
            		);
            
            Student data3= new Student(
            		
                    "https://www.europanostra.org/wp-content/uploads/2017/09/2017-09-Twitter-logo.png",
                    "Twitter",
                    "It matters to us that people have a free and safe space to talk. That’s why we’re constantly improving our rules and processes, technology and tools. ",
                    "https://about.twitter.com/en/who-we-are/our-company",
                    "Twitter",
                    "Today",
                    2,
                    "https://pbs.twimg.com/card_img/1448939191300071434/e2_Cjzft?format=jpg&name=small"
            		
            		);
            
            Student data4= new Student(
            		
                    "https://assets.brandfetch.io/5f9e8493b1df431.png",
                    "Amazon",
                    "The company announced that Amazon Seller Central, the company’s seller management tool, is now open for registration in Egypt via sell.amazon.eg, where individuals can set up their accounts.",
                    "https://egyptianstreets.com/2021/07/27/amazon-to-launch-amazon-eg-in-2021/",
                    "Egyptian Streets",
                    "Today",
                    2,
                    "https://egyptianstreets.com/wp-content/uploads/2021/07/53772740_303.v1.jpg"
            		
            		
            		);
            
            

            repository.saveAll(List.of(data1,data2,data3,data4));
        };
    }


}
