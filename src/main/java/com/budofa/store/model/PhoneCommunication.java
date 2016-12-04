package com.budofa.store.model;

public class PhoneCommunication extends BaseEntity {
	private String phoneText;
	private PhoneCommunicationType phoneCommunicationType;

	public String getPhoneText() {
		return phoneText;
	}

	public void setPhoneText(String phoneText) {
		this.phoneText = phoneText;
	}

	public PhoneCommunicationType getPhoneCommunicationType() {
		return phoneCommunicationType;
	}

	public void setPhoneCommunicationType(
			PhoneCommunicationType phoneCommunicationType) {
		this.phoneCommunicationType = phoneCommunicationType;
	}

}
