import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class lab4 extends JFrame implements ActionListener
{
    JFrame frame = new JFrame("JFRAME WINDOW");
    private final JRadioButton count = new JRadioButton("Количество вхождений", true);
    private final JRadioButton firstind = new JRadioButton("Первый индекс");
    private final JTextField orig = new JTextField();
    private final JTextField item = new JTextField();
    private final JTextField res = new JTextField();
    private final ButtonGroup sort_type = new ButtonGroup();
    private final JButton returnit = new JButton("<-");
    lab4() {

        frame.setBounds(100, 100, 500, 400);
        frame.setVisible(true);
        frame.setLayout(null);

        JLabel str = new JLabel("Исходная строка");
        str.setBounds(10, 60, 120, 20);
        JLabel item_l = new JLabel("По чём сортируем?");
        item_l.setBounds(5, 100, 120, 20);
        JLabel sorted = new JLabel("Сортировка");
        sorted.setBounds(10, 140, 120, 20);

        frame.add(str);
        frame.add(item_l);
        frame.add(sorted);
        returnit.setBounds(400,200,50,50);
        frame.add(returnit);


        orig.setBounds(120, 60, 350, 30);
        item.setBounds(120, 100, 350, 30);
        res.setBounds(120, 140, 350, 30);
        frame.add(orig);
        frame.add(item);
        frame.add(res);

        count.setBounds(10, 10, 200, 20);
        firstind.setBounds(10, 30, 200, 20);
        frame.add(count);
        frame.add(firstind);

        Button sort = new Button("Сортировать");
        sort.setBounds(200, 200, 100, 50);
        sort.addActionListener(this);
        frame.add(sort);

        sort_type.add(count);
        sort_type.add(firstind);


        returnit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Main();
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (sort_type.isSelected(count.getModel()))
        {
            String[] arr = orig.getText().split(" ");
            String abc = item.getText();
            Count c1 = new Count(abc);
            Arrays.sort(arr,c1);
            res.setText(Arrays.toString(arr));
        }
        if (sort_type.isSelected(firstind.getModel()))
        {
            String[] arr = orig.getText().split(" ");
            String abc = item.getText();
            Firstind c1 = new Firstind(abc);
            Arrays.sort(arr,c1);
            res.setText(Arrays.toString(arr));
        }
    }
}