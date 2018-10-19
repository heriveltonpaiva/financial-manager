package br.com.financial.domain;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * This entity represent a fuel launch
 * 
 * @author Herivelton
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Fuel extends AbstractPersistable<Long> {

	private @Enumerated(EnumType.STRING) FuelType type;

	private @Column double valueTotal;

	private @Column double valueByLiter;

	private @Column int currentKM;

	private @ManyToOne(cascade = CascadeType.ALL) Expense expense;

	private @CreatedDate LocalDateTime createdDate;

}
