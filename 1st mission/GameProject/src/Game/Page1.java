package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page1 extends JPanel {
	
   private ImageIcon startButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
   private ImageIcon startButtonImage= new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
   private ImageIcon quitButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
   private ImageIcon quitButtonImage= new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
   
   private Image aisleBackground = new ImageIcon(Main.class.getResource("../images/aisleBackground.png")).getImage();
   
   JButton startBtn = new JButton(startButtonImage);
   JButton quitBtn = new JButton(quitButtonImage);
   
   Page1(){
	   page1Btn();
   }
   
   public void page1Btn() {
	   //������鿡 �� page2 �ν��Ͻ� ����
	   Page2 page2 = new Page2();
	   
	   startBtn.setBounds(200,500,400,100);
       startBtn.setBorderPainted(false);
       startBtn.setContentAreaFilled(false);
       startBtn.setFocusPainted(false);
       startBtn.setVisible(true);
       // ���۹�ư �̺�Ʈ
       startBtn.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
       	// ��ư�� Ŀ�� �÷��� �� �̺�Ʈ
           startBtn.setIcon(startButtonEnteredImage);
           startBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        @Override
        public void mouseExited(MouseEvent e) {
       	// ��ư���� ������ �� �̺�Ʈ
           startBtn.setIcon(startButtonImage);
           startBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
        @Override
        public void mousePressed(MouseEvent e) {
       	// �����ϱ� ��ư ������ �� 
       	// ���� ȭ������ ��ȯ�Ǿ�� �ϹǷ� ���� ��ư�� ����
           startBtn.setVisible(false);
           quitBtn.setVisible(false);
           
           // ���� ��ư ������ page2 Ŭ�������� ��ư, �ؽ�Ʈ�ڽ� ��������
           // Game.mainPanel.add(page2�ν��Ͻ�.JButton�̳� JLabel�� ������)
           Game.mainPanel.add(page2.textBox);
           Game.mainPanel.add(page2.nextBtn);
           // ���� ������ ��� ȭ�� ���� Game.mainPanel.pageBackground = ��溯����;
           Game.mainPanel.pageBackground = aisleBackground;
        }
     });
       
	   	  quitBtn.setBounds(700,500,400,100);
	      quitBtn.setBorderPainted(false); //��ư �ܰ���X
	      quitBtn.setContentAreaFilled(false); // ���뿵�� ä����X
	      quitBtn.setFocusPainted(false); // ���õ��� �� �׵θ�X
	      quitBtn.setVisible(true);
	      
	      // �����ư �̺�Ʈ
	      quitBtn.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	            quitBtn.setIcon(quitButtonEnteredImage);
	            quitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	            quitBtn.setIcon(quitButtonImage);
	            quitBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	            System.exit(0);
	         }
	      });
   }
    
}