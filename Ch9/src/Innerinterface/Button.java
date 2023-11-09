package Innerinterface;

public class Button {
	OnClickListener listener;
	
	void SetOnClickListener(OnClickListener listener)
	{
		this.listener = listener;
	}
	
	public void touch() 
	{
		listener.onClick();
	}
	
	public interface OnClickListener{
		void onClick();
	}//인터페이스 바깥에 따로 빼기 싫어서 이렇게 중첩 인터페이스로 구현해놓는 것. 이러면 상속할 때 Button.OnClickListener 만 해주면 됨.
	
}
