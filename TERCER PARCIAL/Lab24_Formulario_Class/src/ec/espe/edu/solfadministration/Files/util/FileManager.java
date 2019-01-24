/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.solfadministration.Files.util;



import ec.espe.edu.solfadministrationprj.model.Employee;
import ec.espe.edu.solfadministrationprj.model.Worker;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Omar Mejia
 * @author Sebastian Ochoa
 * @author Luis Loachamin
 */
public class FileManager {
	/**
	 * @author Pancho This method can Read de path of the actual proyect
	 * @return Path the path of the proyect in a String
	 */
	public static String readPath() {
		String Path = "";
		File miDir = new File(".");
		try {
			Path = miDir.getCanonicalPath();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("can't read the file path");
		}
		return Path;

	}

	/**
	 * This method write on a file with the given String.
	 * 
	 * @param file
	 * @param text
	 */
	public static void write(File file, String text) {
		FileWriter fileWriter;
		BufferedWriter salida;
		try {
			fileWriter = new FileWriter(file, true);
			salida = new BufferedWriter(fileWriter);
			salida.write(text);
			salida.newLine();
			salida.close();
		} catch (IOException e) {
			System.out.println("Can't read the file");
		}
	}


	/**
	 * @author Pancho
	 * This method can override files with a String
	 * @param fileName The file to override
	 * @param text The new text of the file
	 */
	public static void overrideFile(String fileName, String text) {
		FileWriter fileWriter;
		BufferedWriter salida;
		try {
			fileWriter = new FileWriter(new File(fileName), false);
			salida = new BufferedWriter(fileWriter);
			
			salida.write(text);
			salida.newLine();
			salida.close();
		} catch (IOException e) {
			System.out.println("Can't read the file");
		}
	}
	
	
	/**
	 * @author Pancho This mehod can rescue the data of a file and save this data on
	 *         ArrayLidy of String.
	 * @param file
	 * @return A ArrayList of Strings
	 */
	public static ArrayList<String> dataRescue(File file) {
		ArrayList<String> array = new ArrayList<String>();
		String read;
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader input = new BufferedReader(fileReader);
			read = input.readLine();
			while (read != null) {
				array.add(read);
				read = input.readLine();
			}
		} catch (IOException e) {
			System.out.println("Ocurrio un Error");
		}
		// System.out.println(array);
		return array;
	}

	/**
	 * This method can read and print the content of a file.
	 * 
	 * @param file
	 */
	public static void read(File file) {
		String read;
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader input = new BufferedReader(fileReader);
			read = input.readLine();
			while (read != null) {
				System.out.println(read);
				read = input.readLine();
			}
		} catch (IOException e) {
			System.out.println("Ocurrio un Error");
			System.out.println(e.getMessage());
		}
	}

	
	public static void saveArrayInFileWorker(File file, ArrayList<Worker> product) {
		String letter = "";
                float calculate;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (int k = 0; k < product.size(); k++) {
                               
				letter = product.get(k).getLastName() + ";" + product.get(k).getSalary() + ";"
						+ product.get(k).getTime() +";"+ product.get(k).getTotalSalry();
				bw.write(letter);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un error");
			System.out.println(e.getMessage());
		}
	}


	
	
    public static ArrayList<Worker> createFileWorker(ArrayList<Worker> worker, File file) {
		
                String name;
		float salary;
		int time;
		float total;
		try {
			String read;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				read = br.readLine();
				while ((read != null)) {
					if (read.contains(";")) {
						name= read.split(";")[0];
						salary =Float.parseFloat(read.split(";")[1]);
						time = Integer.parseInt(read.split(";")[2]);
						total = Float.parseFloat(read.split(";")[3]);
						worker.add(new Worker(name,salary,time,total));
					}
					read = br.readLine();
				}
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un Error");
			System.out.println(e.toString());
                        System.out.println(e.getMessage());
		}
		return worker;
	}
    public static void FileWorker(File file, ArrayList<Worker> worker) {
		String letter = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for (int k = 0; k < worker.size(); k++) {
				letter = worker.get(k).getLastName() + ";" +worker.get(k).getSalary() + ";"
						+worker.get(k).getTime()+ ";" + worker.get(k).getTotalSalry();
				bw.write(letter);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un error");
			System.out.println(e.getMessage());
		}
	}
    public static ArrayList<Employee> createArrayEmployeeOfFile(ArrayList<Employee> employee, File file) {
		String name;
		String id;
		String gender;
                int year;
                int month;
                int day;
                Calendar birthDate = Calendar.getInstance();
                String user;
                String password;
		try {
			String read;
			try (FileReader archedad = new FileReader(file)) {
				BufferedReader br = new BufferedReader(archedad);
				read = br.readLine();
				while ((read != null)) {
					if (read.contains(";")) {
						name = read.split(";")[0];
						id = read.split(";")[1];
                                                gender = read.split(";")[2];
                                                year = Integer.parseInt(read.split(";")[3]);
                                                month = Integer.parseInt(read.split(";")[4]);
                                                day = Integer.parseInt(read.split(";")[5]);
                                                user = read.split(";")[6];
                                                password = read.split(";")[7];
                                                
                                                birthDate= new GregorianCalendar(year, month, day);
						employee.add(new Employee(id, name, gender, birthDate, user, password));
					}
					read = br.readLine();
				}
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un Error");
			System.out.println(e.toString());
		}
		return employee;
	}

}
