/* 
 * Developed By: Mohammad Zakaria Chowdhury
 * Company: Webcraft Bangladesh
 * Email: zakaria.cse@gmail.com
 * Website: http://www.webcraftbd.com
 */

package com.davidegialli.radio;

import android.os.Bundle;

public class ChatActivity extends WebviewActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		loadUrl("http://chatroll.com/embed/chat/radio-air-feel?name=radio-air-feel", getResources().getString(R.string.menu_chat));
		//loadUrl("http://www.yoursite.com/about.html");
	}
}
