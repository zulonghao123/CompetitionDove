package cn.yingchuang.command.util;

import cn.yingchuang.entity.Apply;
import cn.yingchuang.entity.Information;
import cn.yingchuang.entity.Members;

/**
 * Created by Administrator on 2018/3/20.
 */
public class AutoCode {



        public String MembersCode(Members members,int membersNum){
            Information information=members.getInformation();
            //生成三位会员id
            String membersid= String.valueOf(members.getId());
            if(membersid.length()<3){
                for (int i=0;i<4-membersid.length();i++){
                    membersid="0"+membersid;
                }
            }
            //生成三位信息ID
            String informationid= String.valueOf(information.getId());
            if(informationid.length()<3){
                for(int i=0;i<4-informationid.length();i++){
                    informationid="0"+informationid;
                }
            }
            //生成一位性别
            String sex= String.valueOf(information.getSex());
            //生成身份证号后4位
            String a=information.getIdNumber();
            String idNum=a.substring(a.length()-4,a.length());
            //生成四位Num
            String membersnum= String.valueOf(membersNum);
            if(membersnum.length()<4){
                for(int i=0;i<6-membersnum.length();i++){
                    membersnum="0"+membersnum;
                }
            }
            String membersCode=membersid+informationid+sex+idNum+membersnum;
            return membersCode;
        }


        public String applyCode(Apply apply,int applynum,int membersApply){
            //生成三位会员ID
            String applyid= String.valueOf(apply.getId());
            if(applyid.length()<3){
                for (int i=0;i<4-applyid.length();i++){
                    applyid="0"+applyid;
                }
            }
            Information information=apply.getInformation();
            //生成三位信息ID
            String informationid= String.valueOf(information.getId());
            if(informationid.length()<4){
                for(int i=0;i<5-informationid.length();i++){
                    informationid="0"+informationid;
                }
            }
            //生成比赛ID
            String raceid= String.valueOf(apply.getRace().getId());
            //生成会员标识
            //生成身份证号后3位
            String a=information.getIdNumber();
            String idNum=a.substring(a.length()-3,a.length());
            //生成三位Num
            String applyNum= String.valueOf(applynum);
            if(applyNum.length()<3){
                for(int i=0;i<4-applyNum.length();i++){
                    applyNum="0"+applyNum;
                }
            }
            String applyCode=applyid+informationid+raceid+membersApply+idNum+applyNum;
            return applyCode;
        }




}
