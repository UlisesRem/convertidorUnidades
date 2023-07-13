import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JInternalFrame;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.channels.Selector;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField valueToConvert;
	private JTextField txtResultado;
	private JComboBox<String> comboBoxItemsLeft = new JComboBox<String>();
	private JComboBox<String> comboBoxItemsRight = new JComboBox<String>();
	//Moneda
	final String mxn = "Peso Mexicano";
	final String dls = "Dolar Estadounidense";
	final String eu = "Euro";
	final String lb = "Libras Esterlinas";
	final String yj = "Yen Japonés";
	final String ws = "Won Sul Coreano";
	//Temperatura
	final String cel ="Grados Celsius °C";
	final String fah ="Grados Fahrenheit °F";
	final String kel = "Kelvin °K";
	//Longitud
	final String cm = "Centimetros";
	final String mt = "Metro";
	final String mll = "Milla";
	final String km = "Kilometro";
	//Tiempo
	 final String sg ="Segundo";
	 final String mn = "Minuto";
	 final String hr ="Hora";
	 final String dd ="Dia";
	 final String mss ="Mes";
	 final String anio ="Año";
	 
	
	String selector = "";
	String selector2 = "";
	int identifier = 0;
	double resultado = 0;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void selectTypeofConvertion() {
		txtResultado.setText("");
		
		switch (identifier) {
		case 1:
			currenlyCovertion();
			break;
			
		case 2:
			temperatureConvertion();
			break;
			
		case 3:
			lenghtConvertion();
			break;
			
		case 4:
			timeConvertion();
			break;

		default:
			System.out.println();
			break;
		}
	}
	
	private void timeConvertion() {
		if(selector == sg) {
			segTo();
		} else if(selector == mn) {
			minTo();
		} else if(selector == hr) {
			hourTo();
		} else if(selector == dd) {
			dayTo();
		} else if(selector == mss) {
			monthTo();
		} else if(selector == anio) {
			yearTo();
		}
	}

	private void yearTo() {
			double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case sg:
			resultado = cantidad *  31536000;
			txtResultado.setText(resultado + "seg");
			break;
			
		case mn:
			resultado = cantidad * 526000;
			txtResultado.setText(resultado + "min");
			break;
			
		case hr:
			resultado = cantidad * 8760;
			txtResultado.setText(resultado + "horas");
			break;
			
		case dd:
			resultado = cantidad * 365;
			txtResultado.setText(resultado + "dias");
			break;
			
		case mss:
			resultado  = cantidad * 12;
			txtResultado.setText(resultado + "meses");
			break;
			
		case anio:
			resultado = cantidad;
			txtResultado.setText(resultado + "años");
			break;
			
		default:
			break;
		}
	}

	private void monthTo() {
double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case sg:
			resultado = cantidad * 2628000 ;
			txtResultado.setText(resultado + "seg");
			break;
			
		case mn:
			resultado = cantidad * 43800;
			txtResultado.setText(resultado + "min");
			break;
			
		case hr:
			resultado = cantidad * 730;
			txtResultado.setText(resultado + "horas");
			break;
			
		case dd:
			resultado = cantidad * 30;
			txtResultado.setText(resultado + "dias");
			break;
			
		case mss:
			resultado  = cantidad;
			txtResultado.setText(resultado + "meses");
			break;
			
		case anio:
			resultado = cantidad / 12;
			txtResultado.setText(resultado + "años");
			break;
			
		default:
			break;
		}
	}

	private void dayTo() {
			double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case sg:
			resultado = cantidad * 86400 ;
			txtResultado.setText(resultado + "seg");
			break;
			
		case mn:
			resultado = cantidad * 1440;
			txtResultado.setText(resultado + "min");
			break;
			
		case hr:
			resultado = cantidad * 24;
			txtResultado.setText(resultado+ "horas");
			break;
			
		case dd:
			resultado = cantidad;
			txtResultado.setText(resultado + "dias");
			break;
			
		case mss:
			resultado  = cantidad / 30;
			txtResultado.setText(resultado + "meses");
			break;
			
		case anio:
			resultado = cantidad / 365;
			txtResultado.setText(resultado + "años");
			break;
			
		default:
			break;
		}
	}

	private void hourTo() {
	double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case sg:
			resultado = cantidad * 3600 ;
			txtResultado.setText(resultado + "seg");
			break;
			
		case mn:
			resultado = cantidad * 60;
			txtResultado.setText(resultado + "min");
			break;
			
		case dd:
			resultado = cantidad - 24;
			txtResultado.setText(resultado + "dias");
			break;
			
		case hr:
			resultado = cantidad;
			txtResultado.setText(resultado + "horas");
			break;
			
		case mss:
			resultado  = cantidad / 730;
			txtResultado.setText(resultado + "meses");
			break;
			
		case anio:
			resultado = cantidad / 8760;
			txtResultado.setText(resultado + "años");
			break;
			
		default:
			break;
		}
	}

	private void minTo() {
	double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case sg:
			resultado = cantidad * 60 ;
			txtResultado.setText(resultado + "seg");
			break;
			
		case mn:
			resultado = cantidad;
			txtResultado.setText(resultado + "min");
			break;
			
		case hr:
			resultado = cantidad / 60;
			txtResultado.setText(resultado + "horas");
			break;
			
		case dd:
			resultado = cantidad / 1440;
			txtResultado.setText(resultado + "dias");
			break;
			
		case mss:
			resultado  = cantidad / 43800;
			txtResultado.setText(resultado + "meses");
			break;
			
		case anio:
			resultado = cantidad / 525600;
			txtResultado.setText(resultado + "años");
			break;
			
		default:
			break;
		}
	}

	private void segTo() {
double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case sg:
			resultado = cantidad;
			txtResultado.setText(resultado + "seg");
			break;
			
		case mn:
			resultado = cantidad / 60;
			txtResultado.setText(resultado + "min");
			break;
			
		case hr:
			resultado = cantidad / 3600;
			txtResultado.setText(resultado + "horas");
			
		case dd:
			resultado = cantidad / 86400;
			txtResultado.setText(resultado + "dias");
			break;
			
		case mss:
			resultado  = cantidad / 2.628e+6;
			txtResultado.setText(resultado + "meses");
			break;
			
		case anio:
			resultado = cantidad / 3.154e+7;
			txtResultado.setText(resultado + "años");
			break;
			
		default:
			break;
		}
	}

	private void lenghtConvertion() {
		if(selector == cm) {
			cmTo();
		} else if(selector == mt) {
			mtTo();
		} else if(selector == mll) {
			mllTo();
		} else if(selector == km) {
			kmTo();
		}
	}

	private void kmTo() {
			double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case cm:
			resultado = cantidad * 100000;
			txtResultado.setText(resultado + "cm");
			break;
			
		case mt:
			resultado = cantidad * 1000;
			txtResultado.setText(resultado + "mt");
			break;
			
		case mll:
			resultado = cantidad / 1.6;
			txtResultado.setText(resultado + "mll");
			break;
			
		case km:
			resultado  = cantidad;
			txtResultado.setText(resultado + "km");
			break;
			
		default:
			break;
		}
	}

	private void mllTo() {
			double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case cm:
			resultado = cantidad * 160900;
			txtResultado.setText(resultado + "cm");
			break;
			
		case mt:
			resultado = cantidad * 1609;
			txtResultado.setText(resultado + "mt");
			break;
			
		case mll:
			resultado = cantidad;
			txtResultado.setText(resultado + "mll");
			break;
			
		case km:
			resultado  = cantidad * 1.6;
			txtResultado.setText(resultado + "km");
			break;
			
		default:
			break;
		}
	}

	private void mtTo() {
			double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case cm:
			resultado = cantidad * 100;
			txtResultado.setText(resultado + "cm");
			break;
			
		case mt:
			resultado = cantidad;
			txtResultado.setText(resultado + "mt");
			break;
			
		case mll:
			resultado = cantidad / 1609;
			txtResultado.setText(resultado + "mll");
			break;
			
		case km:
			resultado  = cantidad / 1000;
			txtResultado.setText(resultado + "km");
			break;
			
		default:
			break;
		}
	}

	private void cmTo() {
	double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case cm:
			resultado = cantidad;
			txtResultado.setText(resultado + "cm");
			break;
			
		case mt:
			resultado = cantidad / 100;
			txtResultado.setText(resultado + "mt");
			break;
			
		case mll:
			resultado = cantidad / 160900;
			txtResultado.setText(resultado + "mll");
			break;
			
		case km:
			resultado  = cantidad / 100000;
			txtResultado.setText(resultado + "km");
			break;
			
		default:
			break;
		}
	}

	private void temperatureConvertion() {
		if(selector == cel) {
			celsiusTo();
		} else if(selector == fah) {
			fahrenTo();
		} else if(selector == kel) {
			kelTo();
		} 
	}

	private void kelTo() {
double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case cel:
			resultado = cantidad - 273.15;
			txtResultado.setText(resultado + "°C");
			break;
			
		case fah:
			resultado = (cantidad - 273.15) * 9/5 + 32;
			txtResultado.setText(resultado + "°F");
			break;
			
		case kel:
			resultado = cantidad;
			txtResultado.setText(resultado + "°K");
			break;
			
		default:
			break;
		}
	}

	private void fahrenTo() {
double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case cel:
			resultado = (cantidad - 32) * 5/9; 
			txtResultado.setText(resultado + "°C");
			break;
			
		case fah:
			resultado = cantidad;
			txtResultado.setText(resultado + "°F");
			break;
			
		case kel:
			resultado = (cantidad - 32) * 5/9 +273.15;
			txtResultado.setText(resultado + "°K");
			break;
			
		default:
			break;
		}
	}

	private void celsiusTo() {
			double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case cel:
			resultado = cantidad;
			txtResultado.setText(resultado + "°C");
			break;
			
		case fah:
			resultado = (cantidad * 9) / 5 + 32;
			txtResultado.setText(resultado + "°F");
			break;
			
		case kel:
			resultado = cantidad + 273.15;
			txtResultado.setText(resultado + "°K");
			break;
			
		default:
			break;
		}
	}

	private void currenlyCovertion() {
		if(selector == mxn) {
			pesoTo();
		} else if(selector == dls) {
			dollarTo();
		} else if(selector == eu) {
			euroTo();
		} else if(selector == lb) {
			librasTo();
		} else if(selector == yj) {
			yenTo();
		} else if(selector == ws) {
			wonTo();
		} 
	}

	private void wonTo() {
			double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case mxn:
			resultado = cantidad * 0.013;
			txtResultado.setText("$"+ resultado);
			break;
			
		case dls:
			resultado = cantidad * 0.00078;
			txtResultado.setText("$"+ resultado);
			break;
			
		case eu:
			resultado = cantidad* 0.00070;
			txtResultado.setText("€"+ resultado);
			break;
			
		case lb:
			resultado = cantidad * 0.0000060;
			txtResultado.setText("£"+ resultado);
			break;
			
		case yj:
			resultado = cantidad * 0.11;
			txtResultado.setText("¥"+ resultado);
			break;
			
		case ws:
			resultado = cantidad;
			txtResultado.setText("₩"+ resultado);
			break;
			
		default:
			break;
		}
	}

	private void yenTo() {
			double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case mxn:
			resultado = cantidad * 0.12;
			txtResultado.setText("$"+ resultado);
			break;
			
		case dls:
			resultado = cantidad * 0.0072;
			txtResultado.setText("$"+ resultado);
			break;
			
		case eu:
			resultado = cantidad * 0.0062;
			txtResultado.setText("€"+ resultado);
			break;
			
		case lb:
			resultado = cantidad * 0.0055;
			txtResultado.setText("£"+ resultado);
			break;
			
		case yj:
			resultado = cantidad;
			txtResultado.setText("¥"+ resultado);
			break;
			
		case ws:
			resultado = cantidad * 9.24;
			txtResultado.setText("₩"+ resultado);
			break;
			
		default:
			break;
		}
	}

	private void librasTo() {
			double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case mxn:
			resultado = cantidad * 22.10;
			txtResultado.setText("$"+ resultado);
			break;
			
		case dls:
			resultado = cantidad * 1.30;
			txtResultado.setText("$"+ resultado);
			break;
			
		case eu:
			resultado = cantidad * 1.18;
			txtResultado.setText("€"+ resultado);
			break;
			
		case lb:
			resultado = cantidad;
			txtResultado.setText("£"+ resultado);
			break;
			
		case yj:
			resultado = cantidad * 180.99;
			txtResultado.setText("¥"+ resultado);
			break;
			
		case ws:
			resultado = cantidad * 1672.71;
			txtResultado.setText("₩"+ resultado);
			break;
			
		default:
			break;
		}
	}

	private void euroTo() {
		double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case mxn:
			resultado = cantidad * 18.80;
			txtResultado.setText("$"+ resultado);
			break;
			
		case dls:
			resultado = cantidad * 1.10;
			txtResultado.setText("$"+ resultado);
			break;
			
		case eu:
			resultado = cantidad;
			txtResultado.setText("€"+ resultado);
			break;
			
		case lb:
			resultado = cantidad * 0.85;
			txtResultado.setText("£"+ resultado);
			break;
			
		case yj:
			resultado = cantidad * 153.98;
			txtResultado.setText("¥"+ resultado);
			break;
			
		case ws:
			resultado = cantidad * 1423.51;
			txtResultado.setText("₩"+ resultado);
			break;
			
		default:
			break;
		}
	}

	private void dollarTo() {
		double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case mxn:
			resultado = cantidad * 17.04;
			txtResultado.setText("$"+ resultado);
			break;
			
		case dls:
			resultado = cantidad;
			txtResultado.setText("$"+ resultado);
			break;
			
		case eu:
			resultado = cantidad * 0.91;
			txtResultado.setText("€"+ resultado);
			break;
			
		case lb:
			resultado = cantidad * 0.77;
			txtResultado.setText("£"+ resultado);
			break;
			
		case yj:
			resultado = cantidad * 139.53;
			txtResultado.setText("¥"+ resultado);
			break;
			
		case ws:
			resultado = cantidad * 1289.23;
			txtResultado.setText("₩"+ resultado);
			break;
			
		default:
			break;
		}
	}

	private void pesoTo() {
		double cantidad = Double.parseDouble(valueToConvert.getText());
		
		// leemos el parametro del combo derecho y comparamos
		switch (selector2) {
		case mxn:
			resultado = cantidad;
			txtResultado.setText("$"+ resultado);
			break;
			
		case dls:
			resultado = cantidad * 0.058;
			txtResultado.setText("$"+ resultado);
			break;
			
		case eu:
			resultado = cantidad * 0.053;
			txtResultado.setText("€"+ resultado);
			break;
			
		case lb:
			resultado = cantidad * 0.045;
			txtResultado.setText("£"+ resultado);
			break;
			
		case yj:
			resultado = cantidad * 8.20;
			txtResultado.setText("¥"+ resultado);
			break;
			
		case ws:
			resultado = cantidad * 75.89;
			txtResultado.setText("₩"+ resultado);
			break;
			
		default:
			break;
		}
	}
	/**
	 * Create the frame.
	 */
	public Vista() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1256, 755);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 128, 0));
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONVERSOR DE UNIDADES");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(324, 12, 512, 74);
		lblNewLabel.setFont(new Font("Cascadia Code", Font.BOLD, 40));
		contentPane.add(lblNewLabel);
		
		JButton btnDivisas = new JButton("DIVISAS");
		btnDivisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtResultado.setText("");
				 valueToConvert.setText("");
				 comboBoxItemsLeft.removeAllItems();
				 comboBoxItemsLeft.addItem(mxn);
				 comboBoxItemsLeft.addItem(dls);
				 comboBoxItemsLeft.addItem(eu);
				 comboBoxItemsLeft.addItem(lb);
				 comboBoxItemsLeft.addItem(yj);
				 comboBoxItemsLeft.addItem(ws);
				 
				 comboBoxItemsRight.removeAllItems();
				 comboBoxItemsRight.addItem(mxn);
				 comboBoxItemsRight.addItem(dls);
				 comboBoxItemsRight.addItem(eu);
				 comboBoxItemsRight.addItem(lb);
				 comboBoxItemsRight.addItem(yj);
				 comboBoxItemsRight.addItem(ws);
				 
				 identifier = 1;
				 
			}
		});
		btnDivisas.setFont(new Font("Cascadia Code", Font.BOLD, 22));
		btnDivisas.setBackground(new Color(255, 255, 255));
		btnDivisas.setForeground(new Color(64, 0, 64));
		btnDivisas.setBounds(94, 141, 165, 57);
		contentPane.add(btnDivisas);
		
		
		JButton btnTemperatura = new JButton("TEMPERATURA");
		btnTemperatura.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 txtResultado.setText("");
				 valueToConvert.setText("");
				 comboBoxItemsLeft.removeAllItems();
				 comboBoxItemsLeft.addItem(cel);
				 comboBoxItemsLeft.addItem(fah);
				 comboBoxItemsLeft.addItem(kel);
				 
				 comboBoxItemsRight.removeAllItems();
				 comboBoxItemsRight.addItem(cel);
				 comboBoxItemsRight.addItem(fah);
				 comboBoxItemsRight.addItem(kel);
				 
				 identifier = 2;
			}
		});
		
		btnTemperatura.setForeground(new Color(64, 0, 64));
		btnTemperatura.setFont(new Font("Cascadia Code", Font.BOLD, 22));
		btnTemperatura.setBackground(new Color(255, 255, 255));
		btnTemperatura.setBounds(380, 141, 182, 57);
		contentPane.add(btnTemperatura);
		
		JButton btnLongitud = new JButton("LONGITUD");
		btnLongitud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
				valueToConvert.setText("");
				comboBoxItemsLeft.removeAllItems();
				comboBoxItemsLeft.addItem(cm);
				comboBoxItemsLeft.addItem(mt);
				comboBoxItemsLeft.addItem(mll);
				comboBoxItemsLeft.addItem(km);
				
				comboBoxItemsRight.removeAllItems();
				comboBoxItemsRight.addItem(cm);
				comboBoxItemsRight.addItem(mt);
				comboBoxItemsRight.addItem(mll);
				comboBoxItemsRight.addItem(km);
				
				identifier = 3;
			}
		});
		btnLongitud.setForeground(new Color(64, 0, 64));
		btnLongitud.setFont(new Font("Cascadia Code", Font.BOLD, 22));
		btnLongitud.setBackground(new Color(255, 255, 255));
		btnLongitud.setBounds(660, 141, 165, 57);
		contentPane.add(btnLongitud);
		
		JButton btnTiempo = new JButton("TIEMPO");
		btnTiempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
				valueToConvert.setText("");
				comboBoxItemsLeft.removeAllItems();
				 comboBoxItemsLeft.addItem(sg);
				 comboBoxItemsLeft.addItem(mn);
				 comboBoxItemsLeft.addItem(hr);
				 comboBoxItemsLeft.addItem(dd);
				 comboBoxItemsLeft.addItem(mss);
				 comboBoxItemsLeft.addItem(anio);
				 
				 comboBoxItemsRight.removeAllItems();
				 comboBoxItemsRight.addItem(sg);
				 comboBoxItemsRight.addItem(mn);
				 comboBoxItemsRight.addItem(hr);
				 comboBoxItemsRight.addItem(dd);
				 comboBoxItemsRight.addItem(mss);
				 comboBoxItemsRight.addItem(anio);
				 
				 identifier = 4;
			}
		});
		btnTiempo.setForeground(new Color(64, 0, 64));
		btnTiempo.setFont(new Font("Cascadia Code", Font.BOLD, 22));
		btnTiempo.setBackground(new Color(255, 255, 255));
		btnTiempo.setBounds(965, 141, 165, 57);
		contentPane.add(btnTiempo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 255, 255)));
		panel.setBackground(new Color(0, 64, 128));
		panel.setBounds(67, 210, 429, 507);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese cantidad y unidad");
		lblNewLabel_1.setLabelFor(this);
		lblNewLabel.setPreferredSize(lblNewLabel.getPreferredSize());
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Cascadia Code", Font.BOLD, 22));
		lblNewLabel_1.setBounds(12, 56, 392, 60);
		panel.add(lblNewLabel_1);
		comboBoxItemsLeft.setFont(new Font("Cascadia Code", Font.BOLD, 15));
		comboBoxItemsLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selector = comboBoxItemsLeft.getSelectedItem().toString();
			}
		});
		
		comboBoxItemsLeft.setBackground(new Color(255, 255, 255));
		comboBoxItemsLeft.setBounds(203, 213, 201, 46);
		panel.add(comboBoxItemsLeft);
		valueToConvert = new JTextField();
		valueToConvert.setHorizontalAlignment(SwingConstants.CENTER);
		valueToConvert.setForeground(new Color(64, 0, 64));
		valueToConvert.setFont(new Font("Cascadia Code", Font.BOLD, 15));
		valueToConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		valueToConvert.setBackground(new Color(239, 239, 239));
		valueToConvert.setBounds(29, 214, 112, 46);
		panel.add(valueToConvert);
		valueToConvert.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("CONVERTIR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectTypeofConvertion();
			}});
		btnNewButton_1.setForeground(new Color(64, 0, 64));
		btnNewButton_1.setFont(new Font("Cascadia Code", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(141, 349, 148, 46);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("que desea convertir");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Cascadia Code", Font.BOLD, 22));
		lblNewLabel_2.setBounds(93, 114, 264, 35);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 255, 255)));
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(739, 210, 429, 507);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Conversion");
		lblNewLabel_1_1.setBounds(145, 84, 169, 37);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Cascadia Code", Font.BOLD, 25));
		panel_1.add(lblNewLabel_1_1);
		
		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setForeground(new Color(64, 0, 64));
		txtResultado.setFont(new Font("Cascadia Code", Font.BOLD, 15));
		txtResultado.setColumns(10);
		txtResultado.setBackground(new Color(255, 255, 255));
		txtResultado.setBounds(79, 337, 274, 48);
		txtResultado.setEditable(false);
		panel_1.add(txtResultado);
		comboBoxItemsRight.setForeground(new Color(64, 0, 64));
		comboBoxItemsRight.setBounds(119, 223, 211, 48);
		panel_1.add(comboBoxItemsRight);
		comboBoxItemsRight.setFont(new Font("Cascadia Code", Font.BOLD, 15));
		comboBoxItemsRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selector2 = comboBoxItemsRight.getSelectedItem().toString();
			}
		});
		comboBoxItemsRight.setBackground(new Color(255, 255, 255));
	}
}