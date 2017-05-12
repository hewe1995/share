package com.hewe.sys.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;

@Repository
public class SendMail {
	private JavaMailSender sender;

	private static final String SYS_MAIL = "272489473@qq.com";

	public JavaMailSender getSender() {
		return sender;
	}

	@Autowired
	public void setSender(JavaMailSender sender) {
		this.sender = sender;
	}

	public boolean sendSysMail(String to, String subject, String text) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setFrom(SYS_MAIL);
		message.setSubject(subject);
		message.setText(text);
		try {
			sender.send(message);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
