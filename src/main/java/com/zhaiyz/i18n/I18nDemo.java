package com.zhaiyz.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18nDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 获得系统默认的国家/语言环境
		Locale myLocale = new Locale("en", "US");

		// 根据指定的国家/语言环境加载对应的资源文件
		ResourceBundle bundle = ResourceBundle.getBundle(
				"com.zhaiyz.i18n.message", myLocale);

		// 获得本地化字符串
		System.out.println(bundle.getString("hello"));
		
		String msg = bundle.getString("msg");
		
		System.out.println(MessageFormat.format(msg,"Java"));
	}
}
