$(document).ready(function($) {
    // 搜索框
    $('.js-so .btn-so').click(function(event) {
        /* Act on the event */
        var txt = $('.inp-so').val();
        if(txt){
            $('.form').submit();
        }else{
            $(this).prev().toggleClass('show');
            return false;
        }
    });
    // PC导航
    $(document).ready(function($) {
        $('.nav li').hover(function() {
            $(this).find('.sub').slideDown()
        }, function() {
            $(this).find('.sub').slideUp()
        });
        // 手机导航
        $('.menuBtn').click(function(event) {
            $(this).toggleClass('open');
            var _winw = $(window).width();
            var _winh = $(window).height();
            if( $(this).hasClass('open') ){
                $('body').addClass('open');
                if( _winw<=959 ){
                    $('.nav').animate({top:'47'});
                }
            }else{
                $('body').removeClass('open');
                if( _winw<=959 ){
                    $('.nav').animate({top:'-150%'});
                }
            }
        });

    });

    // 选项卡 鼠标点击
    $(".TAB_CLICK li").click(function(){
      var tab=$(this).parent(".TAB_CLICK");
      var con=tab.attr("id");
      var on=tab.find("li").index(this);
      $(this).addClass('on').siblings(tab.find("li")).removeClass('on');
      $(con).eq(on).show().siblings(con).hide();

      var href = $(this).data('href');
      $('.m-tab .m-more').attr('href', href);
    });
    $('.TAB_CLICK').each(function(index, el) {
        $('.TAB_CLICK').children('li').filter(':first').trigger('click');
    });

    $('.js-job').click(function(){
        tit = $(this).parents('.item').find('.tit').text();
        $('.pop-formh1').stop(true,true).fadeIn();
        if(tit) $('.pop-formh1').find('.tit').text(tit);
    })
    $('.pop-formh1 .close').click(function(){
        $(this).parents('.pop-formh1').stop(true,true).fadeOut();
    })
    
})