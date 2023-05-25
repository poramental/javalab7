import javax.swing.*;
import java.awt. event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
public class lab3 extends JFrame implements ActionListener {
    private final JFrame frame = new JFrame("hello world");
    private final JButton button = new JButton("Сложить");
    private final JTextField setdata = new JTextField();
    private final JTextField adddata = new JTextField();
    private final JTextField whatabout = new JTextField();
    private final JLabel SET = new JLabel("Напишите дату");
    private final JLabel ADD = new JLabel("Количество дней");
    private final JLabel RELATIONSHIP = new JLabel("Больше или меньше");
    private final JButton returnit = new JButton("<-");

    lab3() {
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(100, 100, 300, 300);

        setdata.setBounds(150, 15, 100, 30);
        adddata.setBounds(150, 85, 100, 30);
        SET.setBounds(20,15,100,20);
        ADD.setBounds(20,85,150,20);

        whatabout.setBounds(150, 160, 100, 30);
        whatabout.setEditable(false);
        RELATIONSHIP.setBounds(20,160,150,20);

        returnit.setBounds(200,200,50,50);
        frame.add(returnit);


        frame.add(RELATIONSHIP);
        frame.add(whatabout);
        frame.add(ADD);
        frame.add(SET);
        frame.add(setdata);
        frame.add(adddata);

        button.setBounds(90, 200, 100, 50);
        button.addActionListener(this);
        frame.add(button);
        returnit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Main();
            }
        });
    }


    private static final String FORMAT_DATE = "yyyy-MM-dd";
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(FORMAT_DATE);
    public static LocalDate addDays(String date, int countDays) {


        LocalDate resultDate = LocalDate.parse(date, dateFormatter);
        int addedDays = 0;
        while (addedDays < countDays) {
            resultDate = resultDate.plusDays(1);
            addedDays++;

        }
        return resultDate;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String a = setdata.getText();
            String b = adddata.getText();
            int b1 = Integer.parseInt(b);


            LocalDate date = LocalDate.now();

            int year = date.getYear();
            int month = date.getMonthValue();
            int dayof = date.getDayOfMonth();
            int today = year*365+month*30+dayof;

            LocalDate result = addDays(a,b1);
            int year1 = result.getYear();
            int month1 = result.getMonthValue();
            int dayof1 = result.getDayOfMonth();
            int newday = year1*365+month1*30+dayof1;
            if(today>newday)
                whatabout.setText("Меньше");
            if(today<newday)
                whatabout.setText("Больше");
            if(today==newday)
                whatabout.setText("Равны");

            JOptionPane.showMessageDialog(null, result);
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Неверное число");
        }
    }
}