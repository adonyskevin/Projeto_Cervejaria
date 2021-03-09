$(function() {
	var decimal = $('.js-decimal');
	decimal.maskMoney({decimal: ',', thousands: '.'});
	
	var inteiro = $('.js-inteiro');
	inteiro.maskMoney({precision: 0, thousands: '.'});
});