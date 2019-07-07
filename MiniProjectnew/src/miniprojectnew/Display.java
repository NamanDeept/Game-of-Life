package miniprojectnew;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Header extends JPanel{
    private JButton home;
    private JButton exit;
    private JButton help;
    Header(JFrame jf)
    {
        home=new JButton("Home");
        exit=new JButton("Exit");
        help=new JButton("Help");
        add(home);
        add(exit);
        add(help);
        home.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jf.dispose();
                Start st=new Start();
                //st.setVisible(true);
                
            }
        });
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              jf.dispose();
            }
        });
        help.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Help st=new Help();
                st.setVisible(true);
            }
        });
    }
}
class Footer extends JPanel {

	private JButton btnStart;
	private JButton btnStop;
	private Matrix matrixPanel;
        private JSlider slider;
        private JButton btnsubmit;
        private JButton btnreset;
        private JComboBox comboColour;
        String types[]={"Still","1. Block","2. Beehive","Oscillator","1. Blinker","2. Toad","SpaceShip","1. Glider","2. Lightweight"};
        private JComboBox jcombobox ; 
        private CellComposition cellComposition;
	Footer(Matrix m) {

		btnStart = new JButton("Start");
		btnStop = new JButton("Stop");
                btnsubmit = new JButton("Add");
                jcombobox = new JComboBox(types);
                btnreset = new JButton("Reset");
                slider=new JSlider(-300,-100,-200);
                slider.setMajorTickSpacing(50);
                slider.setMinorTickSpacing(10);
                slider.setPaintTicks(true);
		add(btnStart);
		add(btnStop);
                add(jcombobox);
                add(btnsubmit);
                add(btnreset);
                add(slider);
		this.matrixPanel = m;
                cellComposition = m.getCellComposition();
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				matrixPanel.toggleGameMode(true);
			}
		});

		btnStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				matrixPanel.toggleGameMode(false);
			}

		});
                slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int x=((JSlider)e.getSource()).getValue();
                                //System.out.println(x);
                                cellComposition.setSpeed(x);
			}

		});
                btnreset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
                                matrixPanel.toggleGameMode(false);
				ArrayList<Point> Cell= new ArrayList<Point>();
                                matrixPanel.setArrayLiveCell(Cell);
			}

		});
                btnsubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(jcombobox.getSelectedItem().equals("Still"))
                                {
                                    
                                }
                                if(jcombobox.getSelectedItem().equals("1. Block"))
                                {
                                    ArrayList<Point> cell1 = new ArrayList<Point>();
                                    Point p1 = new Point(25,25);
                                    Point p2 = new Point(25,26);
                                    Point p3 = new Point(26,25);
                                    Point p4 = new Point(26,26);
                                    cell1.add(p1);
                                    cell1.add(p2);
                                    cell1.add(p3);
                                    cell1.add(p4);
                                    matrixPanel.setArrayLiveCell(cell1);
                                }
                                if(jcombobox.getSelectedItem().equals("2. Beehive"))
                                {
                                    ArrayList<Point> cell1 = new ArrayList<Point>();
                                    Point p1 = new Point(20,22);
                                    Point p2 = new Point(20,23);
                                    Point p3 = new Point(21,21);
                                    Point p4 = new Point(21,24);
                                    Point p5 = new Point(22,23);
                                    Point p6 = new Point(22,22);
                                    cell1.add(p1);
                                    cell1.add(p2);
                                    cell1.add(p3);
                                    cell1.add(p4);
                                    cell1.add(p5);
                                    cell1.add(p6);
                                    matrixPanel.setArrayLiveCell(cell1);
                                }
                                if(jcombobox.getSelectedItem().equals("Oscillator"))
                                {
                                    
                                }
                                if(jcombobox.getSelectedItem().equals("2. Toad"))
                                {
                                    ArrayList<Point> cell1 = new ArrayList<Point>();
                                    Point p1 = new Point(35,35);
                                    Point p2 = new Point(34,35);
                                    Point p3 = new Point(33,36);
                                    Point p4 = new Point(36,37);
                                    Point p5 = new Point(35,38);
                                    Point p6 = new Point(34,38);
                                    cell1.add(p1);
                                    cell1.add(p2);
                                    cell1.add(p3);
                                    cell1.add(p4);
                                    cell1.add(p5);
                                    cell1.add(p6);
                                    matrixPanel.setArrayLiveCell(cell1);
                                }
                                if(jcombobox.getSelectedItem().equals("1. Blinker"))
                                {
                                    ArrayList<Point> cell1 = new ArrayList<Point>();
                                    Point p1 = new Point(30,30);
                                    Point p2 = new Point(30,31);
                                    Point p3 = new Point(30,32);
                                    cell1.add(p1);
                                    cell1.add(p2);
                                    cell1.add(p3);
                                    matrixPanel.setArrayLiveCell(cell1);
                                    System.out.println("Eror");
                                }
                                if(jcombobox.getSelectedItem().equals("1. Glider"))
                                {
                                    ArrayList<Point> cell1 = new ArrayList<Point>();
                                    Point p1 = new Point(37,38);
                                    Point p2 = new Point(36,36);
                                    Point p3 = new Point(36,38);
                                    Point p4 = new Point(37,37);
                                    Point p5 = new Point(35,38);
                                    cell1.add(p1);
                                    cell1.add(p2);
                                    cell1.add(p3);
                                    cell1.add(p4);
                                    cell1.add(p5);
                                    matrixPanel.setArrayLiveCell(cell1);
                                }
                                if(jcombobox.getSelectedItem().equals("2. Lightweight"))
                                {
                                    ArrayList<Point> cell1 = new ArrayList<Point>();
                                    Point p1 = new Point(35,37);
                                    Point p2 = new Point(35,38);
                                    Point p3 = new Point(35,39);
                                    Point p4 = new Point(35,40);
                                    Point p5 = new Point(36,36);
                                    Point p6 = new Point(36,40);
                                    Point p7 = new Point(37,40);
                                    Point p8 = new Point(38,36);
                                    Point p9 = new Point(38,39);
                                    cell1.add(p1);
                                    cell1.add(p2);
                                    cell1.add(p3);
                                    cell1.add(p4);
                                    cell1.add(p5);
                                    cell1.add(p6);
                                    cell1.add(p7);
                                    cell1.add(p8);
                                    cell1.add(p9);
                                    matrixPanel.setArrayLiveCell(cell1);
                                }
                                
			}

		});
	}

}

class Matrix extends JPanel implements ComponentListener, MouseListener {

	private Dimension matrixBoardSize = null;
	private static final int CELL_SIZE = 15;
	private CellComposition cellComposition;
	private ArrayList<Point> liveCell = new ArrayList<Point>();
	private Thread gameThread;
        private String colour = "BLACK";
	Matrix() {
		setSize(new Dimension(800, 500));
		matrixBoardSize = new Dimension(getWidth(), getHeight());
		cellComposition = new CellComposition(this);
		cellComposition.setArrayRef(liveCell);
		cellComposition.setMatrixDimension(matrixBoardSize.width, matrixBoardSize.height);
		addComponentListener(this);
		addMouseListener(this);
	}
        public void setArrayLiveCell(ArrayList<Point> cell){
            liveCell = cell;
            cellComposition.setArrayRef(cell);
            //cellComposition.print();
            repaint();
        }
        public CellComposition getCellComposition(){
            return cellComposition;
        }

	public void toggleGameMode(boolean state) {
		if (state) {
			gameThread = new Thread(cellComposition);
			gameThread.start();
		} else {
			gameThread.interrupt();
		}
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {}

	@Override
	public void componentMoved(ComponentEvent arg0) {}

	@Override
	public void componentResized(ComponentEvent arg0) {
		matrixBoardSize = new Dimension(getWidth(), getHeight());
		cellComposition.setMatrixDimension(matrixBoardSize.width, matrixBoardSize.height);
	}

	@Override
	public void componentShown(ComponentEvent arg0) {}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
                Color color = Color.RED;
		try {
                        switch (colour.toLowerCase()) {
                case "red":
                color = Color.RED;
                break;
                case "blue":
                color = Color.BLUE;
                break;
                case "green":
                color = Color.GREEN;
                break;
                case "black":
                color = Color.BLACK;
                break;
                case "orange":
                color = Color.ORANGE;
                break;
                case "yellow":
                color = Color.YELLOW;
                break;
            }
			g.setColor(color);
			for (Point cell : liveCell) {
				g.fillRect(cell.x * CELL_SIZE, cell.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
			}
                        repaint();
		} catch (Exception e) {
			//System.out.println("Error in Drawing Rect");
		}

		g.setColor(Color.WHITE);
		for (int i = 0; i <= matrixBoardSize.height; i++) {
			g.drawLine((0), i * CELL_SIZE, matrixBoardSize.width, i * CELL_SIZE);
			// //System.out.println(i);
		}
		for (int i = 0; i <= matrixBoardSize.width; i++) {
			g.drawLine((i * CELL_SIZE), 0, (i * CELL_SIZE), matrixBoardSize.height);
			// //System.out.println(i);
		}
	}

	public void deleteCell(Point p) {
		liveCell.remove(p);
	}

	public void addCell(int x, int y) {
		Point p = new Point(x, y);
		if (!liveCell.contains(p)) {
			liveCell.add(p);
		} else {
			deleteCell(p);
		}
		repaint();
	}
        public void changeColour(String colour_new){
        colour = colour_new;
    }
	public void addCell(MouseEvent e) {
		int x_width = e.getPoint().x / CELL_SIZE;
		int y_height = e.getPoint().y / CELL_SIZE;

		if ((x_width >= 0) && (x_width < matrixBoardSize.width) && (y_height >= 0)
				&& (y_height < matrixBoardSize.height)) {
			addCell(x_width, y_height);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {
		addCell(e);
	}
}

class CellComposition implements Runnable {

	private ArrayList<Point> liveCell;
	private int matrixWidth, matrixHeight;
	private Matrix matrix;
        private int speed = -200;

	public CellComposition(Matrix m) {
		matrix = m;
	}
        
        public void setSpeed(int s){
            speed = s;
        }

	public void setArrayRef(ArrayList<Point> liveCell) {
		this.liveCell = liveCell;
	}

	public void setMatrixDimension(int width, int height) {
		matrixWidth = width;
		matrixHeight = height;
	}

	@Override
	public void run() {
            		int gamePanel[][] = new int[matrixWidth + 2][matrixHeight + 2];
		ArrayList<Point> nextGeneration = new ArrayList<Point>();


		for (Point cell : liveCell) {
			gamePanel[cell.x + 1][cell.y + 1] = 1;
		}

		for (int i = 1; i < gamePanel.length - 1; i++) {
			for (int j = 1; j < gamePanel[i].length - 1; j++) {

				int neighbourCell = 0;
				if (gamePanel[i - 1][j - 1] == 1) {
					neighbourCell++;
				}
				if (gamePanel[i - 1][j] == 1) {
					neighbourCell++;
				}
				if (gamePanel[i - 1][j + 1] == 1) {
					neighbourCell++;
				}
				if (gamePanel[i][j + 1] == 1) {
					neighbourCell++;
				}
				if (gamePanel[i + 1][j + 1] == 1) {
					neighbourCell++;
				}
				if (gamePanel[i + 1][j] == 1) {
					neighbourCell++;
				}
				if (gamePanel[i + 1][j - 1] == 1) {
					neighbourCell++;
				}
				if (gamePanel[i][j - 1] == 1) {
					neighbourCell++;
				}

				if (gamePanel[i][j] == 1) {
					if (neighbourCell == 2 || neighbourCell == 3) {
						nextGeneration.add(new Point(i - 1, j - 1));
					}
				} else {
					if (neighbourCell == 3) {
						nextGeneration.add(new Point(i - 1, j - 1));
					}
				}
			}
		}

		liveCell.clear();
		liveCell.addAll(nextGeneration);
		matrix.repaint();
		try {
                    ////System.out.println("speed = " + speed);
			Thread.sleep(-1*speed);
			run();
		} catch (Exception e) {
			//System.out.print("Error in Running Thread");
		}
	}
}

public class Display extends JFrame {

	private JPanel contentPane;
	private Footer footer;
	private Matrix matrix;
        private Header header;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display frame = new Display();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Display() {
                
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
		setSize(new Dimension(1200, 800));

		// JPanel panel = new JPanel();
		// contentPane.add(panel, BorderLayout.CENTER);
		// panel.setLayout(new BorderLayout(0, 0));
                String colour[] = new String[6];
                colour[0] = "Black";
                colour[2] = "Blue";
                colour[1] = "Green";
                colour[3] = "Yellow";
                colour[4] = "Orange";
                colour[5] = "Red";
        
                JComboBox comboColour = new JComboBox(colour);
		matrix = new Matrix();
                matrix.setBackground(Color.WHITE);
		contentPane.add(matrix, BorderLayout.CENTER);
                contentPane.setBackground(Color.BLACK);
		footer = new Footer(matrix);
		contentPane.add(footer, BorderLayout.SOUTH);
                header=new Header(this);
                header.setBackground(Color.BLACK);
                footer.setBackground(Color.BLACK);
                footer.add(comboColour);
                contentPane.add(header,BorderLayout.NORTH);
                ActionListener ColourListener = new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    matrix.changeColour(comboColour.getItemAt(comboColour.getSelectedIndex())+"");
                }
          };
                comboColour.addActionListener(ColourListener);
		// JPanel panel_2 = new JPanel();
		// contentPane.add(panel_2, BorderLayout.CENTER);
	}

}
