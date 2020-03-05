$(document).ready(function(){


    //初始化表格
    init();


    function init() {
        GetTableData();
    }

    $(document).on("click","#updatebtn",function(){
        var id = $(this).parent().parent().children().eq(0).text();
        var name = $(this).parent().parent().children().eq(1).text();
        var sex = $(this).parent().parent().children().eq(2).text();
        var QQ = $(this).parent().parent().children().eq(3).text();
        var phone = $(this).parent().parent().children().eq(4).text();
        var depname = $(this).parent().parent().children().eq(5).text();

        //回显
        $('#id').val(id);
        $('#update_name').val(name);
        $('#update_sexSelect').val(sex);
        $('#update_QQnumber').val(QQ);
        $('#update_phone').val(phone);
        $('#update_depSelect').val(depname);

    });

    function GetTableData(){
        $.ajax({
            type: "GET",
            url: "/user/getAllCustomers",
            async : true,
            success:function(data){
                console.log(data);
                CreateChildRow(data.data);
                $('#row1').siblings('.row1child').hide();
                $('#row2').siblings('.row2child').hide();
                $('#row3').siblings('.row3child').hide();
                $('#row4').siblings('.row4child').hide();
                $('#row5').siblings('.row5child').hide();
            },
            error:function(){
                alert("请求失败，系统内部问题");
            }
        })
    }

    function CreateChildRow(data){
        for(var i = 0; i < data.row1.length; i++){
            var Row1 = "<tr class='row1child'>";
            var id = data.row1[i].id;
            Row1 = Row1 + "<td>" + id + "</td>";
            var name = data.row1[i].username;
            Row1 = Row1 + "<td>" + name + "</td>";
            var sex = "";
            if(data.row1[i].sex==1)
            {
                sex = "男"
            }
            else{
                sex = "女";
            }
            Row1 = Row1 + "<td>" + sex + "</td>";
            var QQ = data.row1[i].qq;
            Row1 = Row1 + "<td>" + QQ + "</td>";
            var phone = data.row1[i].phone;
            Row1 = Row1 + "<td>" + phone + "</td>";
            var depname = data.row1[i].depname;
            Row1 = Row1 + "<td>" + depname + "</td>";
            Row1 = Row1 + "<td><button id=\"updatebtn\" type=\"button\" class=\"layui-btn layui-btn-normal\" data-toggle=\"modal\" data-target=\"#updatemodal\">更新信息</button></td>\n" +
                "<td><button id=\"delbtn\" type=\"button\" class=\"layui-btn layui-btn-danger\">删除信息</button></td>";
            Row1 = Row1 + "</tr>";
            $('#row1').after(Row1);
        }
        for(var i = 0; i < data.row2.length; i++){
            var Row1 = "<tr class='row2child'>";
            var id = data.row2[i].id;
            Row1 = Row1 + "<td>" + id + "</td>";
            var name = data.row2[i].username;
            Row1 = Row1 + "<td>" + name + "</td>";
            var sex = "";
            if(data.row2[i].sex==1)
            {
                sex = "男"
            }
            else{
                sex = "女";
            }
            Row1 = Row1 + "<td>" + sex + "</td>";
            var QQ = data.row2[i].qq;
            Row1 = Row1 + "<td>" + QQ + "</td>";
            var phone = data.row2[i].phone;
            Row1 = Row1 + "<td>" + phone + "</td>";
            var depname = data.row2[i].depname;
            Row1 = Row1 + "<td>" + depname + "</td>";
            Row1 = Row1 + "<td><button id=\"updatebtn\" type=\"button\" class=\"layui-btn layui-btn-normal\" data-toggle=\"modal\" data-target=\"#updatemodal\">更新信息</button></td>\n" +
                "<td><button id=\"delbtn\" type=\"button\" class=\"layui-btn layui-btn-danger\">删除信息</button></td>";
            Row1 = Row1 + "</tr>";
            $('#row2').after(Row1);
        }
        for(var i = 0; i < data.row3.length; i++){
            var Row1 = "<tr class='row3child'>";
            var id = data.row3[i].id;
            Row1 = Row1 + "<td>" + id + "</td>";
            var name = data.row3[i].username;
            Row1 = Row1 + "<td>" + name + "</td>";
            var sex = "";
            if(data.row3[i].sex==1)
            {
                sex = "男"
            }
            else{
                sex = "女";
            }
            Row1 = Row1 + "<td>" + sex + "</td>";
            var QQ = data.row3[i].qq;
            Row1 = Row1 + "<td>" + QQ + "</td>";
            var phone = data.row3[i].phone;
            Row1 = Row1 + "<td>" + phone + "</td>";
            var depname = data.row3[i].depname;
            Row1 = Row1 + "<td>" + depname + "</td>";
            Row1 = Row1 + "<td><button id=\"updatebtn\" type=\"button\" class=\"layui-btn layui-btn-normal\" data-toggle=\"modal\" data-target=\"#updatemodal\">更新信息</button></td>\n" +
                "<td><button id=\"delbtn\" type=\"button\" class=\"layui-btn layui-btn-danger\">删除信息</button></td>";
            Row1 = Row1 + "</tr>";
            $('#row3').after(Row1);
        }
        for(var i = 0; i < data.row4.length; i++){
            var Row1 = "<tr class='row4child'>";
            var id = data.row4[i].id;
            Row1 = Row1 + "<td>" + id + "</td>";
            var name = data.row4[i].username;
            Row1 = Row1 + "<td>" + name + "</td>";
            var sex = "";
            if(data.row4[i].sex==1)
            {
                sex = "男"
            }
            else{
                sex = "女";
            }
            Row1 = Row1 + "<td>" + sex + "</td>";
            var QQ = data.row4[i].qq;
            Row1 = Row1 + "<td>" + QQ + "</td>";
            var phone = data.row4[i].phone;
            Row1 = Row1 + "<td>" + phone + "</td>";
            var depname = data.row4[i].depname;
            Row1 = Row1 + "<td>" + depname + "</td>";
            Row1 = Row1 + "<td><button id=\"updatebtn\" type=\"button\" class=\"layui-btn layui-btn-normal\" data-toggle=\"modal\" data-target=\"#updatemodal\">更新信息</button></td>\n" +
                "<td><button id=\"delbtn\" type=\"button\" class=\"layui-btn layui-btn-danger\">删除信息</button></td>";
            Row1 = Row1 + "</tr>";
            $('#row4').after(Row1);
        }
        for(var i = 0; i < data.row5.length; i++){
            var Row1 = "<tr class='row5child'>";
            var id = data.row5[i].id;
            Row1 = Row1 + "<td>" + id + "</td>";
            var name = data.row5[i].username;
            Row1 = Row1 + "<td>" + name + "</td>";
            var sex = "";
            if(data.row5[i].sex==1)
            {
                sex = "男"
            }
            else{
                sex = "女";
            }
            Row1 = Row1 + "<td>" + sex + "</td>";
            var QQnumber = data.row5[i].qq;
            Row1 = Row1 + "<td>" + QQnumber + "</td>";
            var phone = data.row5[i].phone;
            Row1 = Row1 + "<td>" + phone + "</td>";
            var depname = data.row5[i].depname;
            Row1 = Row1 + "<td>" + depname + "</td>";
            Row1 = Row1 + "<td><button id=\"updatebtn\" type=\"button\" class=\"layui-btn layui-btn-normal\" data-toggle=\"modal\" data-target=\"#updatemodal\">更新信息</button></td>\n" +
                "<td><button id=\"delbtn\" type=\"button\" class=\"layui-btn layui-btn-danger\">删除信息</button></td>";
            Row1 = Row1 + "</tr>";
            $('#row5').after(Row1);
        }
    }

    //表单的展开与关闭
    $('#row1').click(function(){
        $(this).toggleClass("selected");
        $(this).siblings('.row1child').toggle();
    });

    //表单的展开与关闭
    $('#row2').click(function(){
        $(this).toggleClass("selected");
        $(this).siblings('.row2child').toggle();
    })

    //表单的展开与关闭
    $('#row3').click(function(){
        $(this).toggleClass("selected");
        $(this).siblings('.row3child').toggle();
    })

    //表单的展开与关闭
    $('#row4').click(function(){
        $(this).toggleClass("selected");
        $(this).siblings('.row4child').toggle();
    })

    //表单的展开与关闭
    $('#row5').click(function(){
        $(this).toggleClass("selected");
        $(this).siblings('.row5child').toggle();
    })
});