package com.design.pattern.adapter;

/**
 * 高级多媒体播放器
 * @author Roger
 */
public interface AdvancedMediaPlayer {
	
	public void playVlc(String fileName);

	public void playMp4(String fileName);
	
}