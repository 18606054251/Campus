package classmateBook;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import Dao.dUsers;
import model.Users;

import javax.swing.JLabel;
import javax.swing.JOptionPane;





public class S_input extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField stu_name = null;
	private JTextField stu_address = null;
	private JTextField stu_phone = null;
	private JTextField stu_wechat = null;
	private JTextField stu_email = null;
	private JTextField stu_qq = null;
	private JTextArea stu_message = null;


	
	public S_input() {
		setTitle("学生信息导入");								//设置窗体标题
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//单击关闭按钮是关闭
		setSize(300,700);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.setAlignmentX(CENTER_ALIGNMENT);
		panel1.setBorder(BorderFactory.createEmptyBorder(30, 30, 0, 30));
		JLabel label1 = new JLabel("姓名：");
		label1.setAlignmentX(LEFT_ALIGNMENT);
		stu_name = new  JTextField();
		stu_name.setAlignmentX(LEFT_ALIGNMENT);


		
	
		JLabel label2 = new JLabel("家庭住址：");
		label2.setAlignmentX(LEFT_ALIGNMENT);
		stu_address= new  JTextField();
		stu_address.setAlignmentX(LEFT_ALIGNMENT);

		
		
		JLabel label3 = new JLabel("电话：");
		label3.setAlignmentX(LEFT_ALIGNMENT);
		stu_phone= new  JTextField();
		stu_phone.setAlignmentX(LEFT_ALIGNMENT);


		
		JLabel label4 = new JLabel("微信：");
		label4.setAlignmentX(LEFT_ALIGNMENT);
		stu_wechat= new  JTextField();
		stu_wechat.setAlignmentX(LEFT_ALIGNMENT);

		
		JLabel label5 = new JLabel("邮箱：");
		label5.setAlignmentX(LEFT_ALIGNMENT);
		stu_email= new  JTextField();
		stu_email.setAlignmentX(LEFT_ALIGNMENT);

		
		JLabel label6 = new JLabel("QQ：");
		label6.setAlignmentX(LEFT_ALIGNMENT);
		stu_qq= new  JTextField();
		stu_qq.setAlignmentX(LEFT_ALIGNMENT);

		
		
		JLabel label7 = new JLabel("个性语言：");
		stu_message= new JTextArea(20,10);
		JScrollPane sPane  = new JScrollPane(stu_message);
		sPane.setAlignmentX(LEFT_ALIGNMENT);

		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
		panel4.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));


		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.setAlignmentX(CENTER_ALIGNMENT);
		panel2.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

		JButton jb1 = new JButton("提交");
		jb1.setAlignmentX(CENTER_ALIGNMENT);


		
		
		panel1.add(label1);
		panel1.add(stu_name);
		panel1.add(label2);
		panel1.add(stu_address);
		panel1.add(label3);
		panel1.add(stu_phone);
		panel1.add(label4);
		panel1.add(stu_wechat);
		panel1.add(label5);
		panel1.add(stu_email);
		panel1.add(label6);
		panel1.add(stu_qq);
		panel1.add(label7);
		panel1.add(sPane);
		panel2.add(jb1);
		
		
		panel4.add(panel1);
		panel4.add(panel2);
		
		this.add(panel4);

		

	

		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Users user = new Users();
				user.setUsname(stu_name.getText());
				user.setUsaddress(stu_address.getText());
				user.setUsdiy(stu_phone.getText());
				user.setUsweixin(stu_wechat.getText());
				user.setUsyouxiangadd(stu_email.getText());
				user.setUsqq(stu_qq.getText());
				
				dUsers dUser = new dUsers();
				dUser.editUser(user);
				JOptionPane.showConfirmDialog(null, "修改成功！", "消息", JOptionPane.YES_NO_OPTION);
			}
		});



}
}

