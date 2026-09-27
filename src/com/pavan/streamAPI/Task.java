package com.pavan.streamAPI;

import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Task implements Runnable{
@Override
    public void run()
{
    for (int i = 0; i < 10; i++) {
        System.out.printf("%d ",i);
    }
}
}
