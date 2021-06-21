package ru.gunmarket.vakoom;

import vakoom.gunmarket.ru.TimeService;


public class Main {
	private static final TimeServiceWrapper timeServiceWrapper = new TimeServiceWrapper();

	public static void main(String[] args) {
		assert timeServiceWrapper.time().isBefore(TimeService.utcNow());
	}
}
