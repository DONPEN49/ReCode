package Calender;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;

public class CalenderView {

	/*************************
	 * フィールド
	 *************************/

	//カレンダーマトリックス用の配列
	public int[][] calendarMatrix;

	//カレンダー月の年月
	private Year year;

	//月初用LocalDate
	LocalDate ld;

	/***********************
	 * コンストラクタ
	 ***********************/

	//今年をセット
	public CalenderView() {
		this.setYear();
	}

	/***********************
	 * メソッド
	 ***********************/

	//year setter
	private void setYear() {
		this.year = Year.now();
	}

	//今年のyearを返す
	private Year getYear() {
		return this.year;
	}

	//指定月の月初setter
	private void setLd(int month) {
		this.ld = LocalDate.of(this.getYear().getValue(), month, 1);
	}

	//指定月の月初getter
	private LocalDate getLd() {
		return this.ld;
	}

	//指定月の長さを取り出す
	private int getMonthLength() {
		Month thisMonth = Month.from(getLd());
		return thisMonth.length(this.ld.isLeapYear());
	}

	//月初の曜日を取得
	private int getFirstDay() {
		return getLd().getDayOfWeek().getValue() - 1; //月:0 火:1 水:2 ・・・
	}

	//それぞれの月の配列に日数を入れ込む
	public void calcFields() {

		int row = 0;
		int column = getFirstDay();

		for (int date = 1; date <= getMonthLength(); date++) {
			this.calendarMatrix[row][column] = date;
			if (column == 6) {
				row++;
				column = 0;
			} else {
				column++;
			}
		}
	}

	public ArrayList<ArrayList<Integer>> getCalederData(int month) {

		this.calendarMatrix = new int[6][7];
		this.setLd(month);

		calcFields();

		ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();

		for(int i = 0; i < calendarMatrix.length; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			for(int j = 0; j < calendarMatrix[i].length; j++) {
				list.add(calendarMatrix[i][j]);
			}
			list2d.add(list);
		}

		return list2d;
	}
}