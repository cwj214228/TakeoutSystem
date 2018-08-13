package server;

/**
 * 
 * @author Administrator
 * Protocal: CUSTOMER_LOGIN, CUSTOMER_SIGNOUT, CUSTOMER_REGISTER,
 * 			 BUSNESS_LOGIN, BUSNESS_SINGOUT, BUNESS_REGISTER,
 * 			 COURIER_LOGIN, COURIER_SIGNOUT, COURIER_REGISTER,
 * 			 ADMINISTRATOR_LOGIN,ADMINISTRATOR_SIGNOUT
 */

public interface Protocal {
	
	int CUSTOMER_LOGIN = 101;
	int CUSTOMER_SIGNOUT = 1001;
	int CUSTOMER_REGISTER = 10001;
	int CUSTOMER_REMINDER = 20001;		//�˿ʹߵ�
	int CUSTOMER_FAVORITE = 2002;		//�˿��ղ�
	int CUSTOMER_COLLECTION = 2003;     //�˿������ղ�
	int CUSTOMER_DELETECOLLECTION = 2004;   //�˿�ɾ���ղ�
	int CUSTOMER_SEARCH=10004;
	int CUSTOMER_BUY=10005;    //�û�����
	int CUSTOMER_EDITINFORMATION=100003;//�˿��޸ĸ�����Ϣ
	int CUSTOMER_VIEWORDER=100011;     //�û��鿴����
	int CUSTOMER_EVOLUATE=100012;     //�û�����
	int CUSTOMER_BUYFOOD=10012;    //�˿͹���ʳ��
	int CUSTOMER_VIEWREDEVENLOPE = 10013;		//�̼Ҳ鿴���º��
	int CUSTOMER_ADDREDEVENLOPE = 10014;		//�̼����Ӻ��
	int CUSTOMER_DELETEREDEVENLOPE = 10015;		//�̼�ɾ�����
	int CUSTOMER_USEREDEVENLOPE = 10016;		//�û�ʹ�ú��
	int CUSTOMER_COMMENT = 10017;		//�û�����
	
	int BUSINESS_LOGIN = 102;
	int BUSINESS_SINGOUT = 1002;
	int BUSINESS_REGISTER = 10002;
	int BUSINESS_UPFOOD = 20002;		//�ϼ���Ʒ
	int BUSINESS_DOWNFOOD = 20003;		//�¼���Ʒ
	int BUSINESS_OPEN = 20004;			//����
	int BUSINESS_CLOSE = 20005;			//�ص�
	int BUSINESS_VIEWCOMMENT = 20006;		//�鿴����
	int BUSINESS_REPLAYCOMMENT = 20007;		//�ظ�����
	int BUSINESS_MODIFYINFORMATION = 20008;		//�̼��޸ĸ�����Ϣ
	int BUSINESS_VIEWORDER = 20009;			//�̼Ҳ鿴�û�����
	int BUSINESS_SHOWFOODS = 20010;       //�̼ҹ����Լҵ�ʳ�� 
	int BUSINESS_GETSHOP = 20011;       //�̼ҵ�½�ɹ��󣬻�ȡ�Լ��̵����Ϣ
	int BUSINESS_VIEWREDEVENLOPE = 20012;		//�̼Ҳ鿴���º��
	int BUSINESS_ADDREDEVENLOPE = 20013;		//�̼����Ӻ��
	int BUSINESS_DELETEREDEVENLOPE = 20014;		//�̼�ɾ�����
	int BUSINESS_STATUS = 20015;			//�ж��̼��Ƿ�Ӫҵ
	
	int COURIER_LOGIN = 103;
	int COURIER_SIGNOUT = 1003;
	int COURIER_REGISTER = 10003;
	int ADMINISTRATOR_LOGIN = 104;
	int ADMINISTRATOR_SIGNOUT = 1004;
	
	int SHOWALLSHOP=10086;    //��ҳչʾ�����̵�
	
	int CUSTOMER_CONNECTBUSINESS = 10087;		//�û���ϵ�̼�
	int CUSTOMER_READMESSAGE = 10088;			//�û���ȡ��Ϣ
	int BUSINESS_CONNECTCUSTOMER = 10089;		//�̼���ϵ�û�
	int BUSINESS_READMESSAGE = 10090;			//�̼Ҷ�ȡ��Ϣ
}