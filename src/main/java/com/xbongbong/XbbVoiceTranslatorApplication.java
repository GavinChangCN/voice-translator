package com.xbongbong;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 启动累
 * @author 章华隽
 */
@SpringBootApplication
public class XbbVoiceTranslatorApplication {

	public static void main(String[] args) {
		// 控制 Banner 的显示模式，Banner 在resources中的 Banner.txt内，可以前往 http://patorjk.com/software/taag 进行自定义
		new SpringApplicationBuilder(XbbVoiceTranslatorApplication.class)
				.bannerMode(Banner.Mode.CONSOLE)
				.run(args);
	}
}
