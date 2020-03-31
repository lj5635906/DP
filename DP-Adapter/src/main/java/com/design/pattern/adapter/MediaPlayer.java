package com.design.pattern.adapter;

/**
 * 多媒体播放
 * 
 * @author Roger
 */
public interface MediaPlayer {

	/**
	 * 播放方法
	 * 
	 * @param audioType
	 *            多媒体类型
	 * @param fileName
	 *            文件名
	 */
	 void play(String audioType, String fileName);

}
