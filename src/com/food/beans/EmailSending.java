package com.food.beans;

import java.io.IOException;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

public class EmailSending {
	
	
	public static void sendEmail() {
		
	Email from = new Email("vamshi.sai.9866@gmail.com");
    String subject = "Sending with SendGrid is Fun";
    Email to = new Email("sandeepchary.winspire@gmail.com");
    Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
    Mail mail = new Mail(from, subject, to, content);

    SendGrid sg = new SendGrid("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");
    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sg.api(request);
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody());
      System.out.println(response.getHeaders());
    } catch (IOException ex) {
      try {
		throw ex;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
  }


}
