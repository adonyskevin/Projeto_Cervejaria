var Brewer = Brewer || {};

Brewer.MaskMoney = (function(){
	
	function MaskMoney(){
		this.decimal = $('.js-decimal');
		this.inteiro = $('.js-inteiro');
	}
	
	MaskMoney.prototype.enable = function(){
		this.decimal.maskMoney({decimal: ',', thousands: '.'});
		this.inteiro.maskMoney({precision: 0, thousands: '.'});
	}
	
	return MaskMoney;
	
}());

$(function() {
	var maskMoney = new Brewer.MaskMoney();
	maskMoney.enable();
});