package com.lintcode;

public class Add_Two_Numbers {
    public ListNode addLists(ListNode l1, ListNode l2) {
        ListNode node=new ListNode(0);
        ListNode res=node;
        int flag=0;
        while(l1!=null&&l2!=null){
        	int temp=(l1.val+l2.val+flag)/10;
        	l1.val=(l1.val+l2.val+flag)%10;
        	flag=temp;
        	node.next=l1;
        	
        	l1=l1.next;
        	l2=l2.next;
        	node=node.next;
        }
        
        if(l1==null&&l2==null){
        	if(flag!=0){
        		ListNode last=new ListNode(flag);
        		node.next=last;
        		last.next=null;
        	}
        }
        else{	
        	ListNode newNode=l1!=null?l1:l2;
        	while(newNode!=null){
        		int temp=(newNode.val+flag)/10;
        		newNode.val=(newNode.val+flag)%10;
        		flag=temp;
        		node.next=newNode;
        		newNode=newNode.next;
        		node=node.next;
        	}
        	if(flag!=0){
        		ListNode last=new ListNode(flag);
        		node.next=last;
        		last.next=null;
        	}
        }
        return res.next;
    }
}
