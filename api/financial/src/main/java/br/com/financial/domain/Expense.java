package br.com.financial.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Expense extends AbstractPersistable<Long>{
	
	private @Column double value;
	private @Enumerated(EnumType.STRING) PaymentMode paymentMode;

}
