package com.company;

import javax.swing.*;
import java.awt.*;

public class BallGame extends JFrame {
    Image desk = Toolkit.getDefaultToolkit().getImage("com/company/images/台桌.jpg");
    Image ball = Toolkit.getDefaultToolkit().getImage("com/company/images/小球.png");
    //这里在调用图片时，请使用电脑的绝对路径，不然可能显示不了图片
    double x = 100;    //小球的横坐标
    double y = 100;    //小球的纵坐标

    double degree = 3.14 / 3;    //弧度，此处为60度

    //画窗口的方法
    public void paint(Graphics g) {
        System.out.println("init Game!");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);

        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);

        //碰到上下边界
        if (y > 500 - 40 - 30 || y < 40 + 40) {
            //856是窗口高度，40是桌子边框，30是小球直径，最后一个40是标题栏的高度
            degree = -degree;
        }

        //碰到左右边界
        if (x < 40 || x > 856 - 40 - 30) {
            degree = 3.14 - degree;
        }
    }

    //窗口加载
    void launchFrame() {
        setSize(856, 500);
        setLocation(50, 50);
        setVisible(true);

        //重画窗口，每秒画25次
        while (true) {
            repaint();
            try {
                Thread.sleep(40);//40ms
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}