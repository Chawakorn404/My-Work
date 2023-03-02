/**
 * Menu Button
 * Copyright 2017 Khrongpop Phonngam
 * ICT Slipakorn
  */

  $(document).ready(function () {
  	
  	var bt_l1 = $('#button_top_left');
  	var bt_l2 = $('#button_bottom_left');
  	var bt_r1 = $('#button_top_right');
  	var bt_r2 = $('#button_bottom_right');

  	var contein_l1 = $('.contain_menu1');
  	var contein_r1 = $('.contain_menu2');
  	var contein_l2 = $('.contain_menu3');
  	var contein_r2 = $('.contain_menu4');


  	if(bt_l1.click(function () {

  		bt_l1.addClass('menu_active');
  		bt_r1.removeClass('menu_active');

  		contein_r1.css('display','none');
  		contein_l1.css('display','block');
  	}));

  	if(bt_r1.click(function () {

  		bt_l1.removeClass('menu_active');
  		bt_r1.addClass('menu_active');

  		contein_r1.css('display','block');
  		contein_l1.css('display','none');

  	}));

  	if(bt_l2.click(function () {

  		bt_l2.addClass('menu_active');
  		bt_r2.removeClass('menu_active');

  		contein_r2.css('display','none');
  		contein_l2.css('display','block');
  	}));

  	if(bt_r2.click(function () {

  		bt_l2.removeClass('menu_active');
  		bt_r2.addClass('menu_active');

  		contein_r2.css('display','block');
  		contein_l2.css('display','none');
  		
  	}));


  	// dropdown 

  	var button = $('.button_list_item');
  	var menu_dropdown = $('.dropmenu');
  	if(button.click(function () {
  		button.toggleClass('on_click');
  		menu_dropdown.toggleClass('this_active');
  	}));

  });


