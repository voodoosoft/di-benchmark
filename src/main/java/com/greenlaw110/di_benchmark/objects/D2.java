package com.greenlaw110.di_benchmark.objects;

import java.util.Objects;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.drinkjava2.BeanBox;
import com.github.drinkjava2.InjectBox;

@InjectBox(prototype = true) // for jBeanBox usage
@Component // for Spring usage
@Scope("prototype") // for Spring usage
public class D2 {
	@de.voodoosoft.blackcat.Inject
	private E e;

	public D2() {
	}

	@InjectBox // for jBeanBox
	@Inject // for JSR330 compliant DI libraries
	public D2(E e) {
		this.e = e;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		D2 d2 = (D2) o;
		return Objects.equals(e, d2.e);
	}

	@Override
	public int hashCode() {
		return Objects.hash(e);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	public static void main(String[] args) {
		BeanBox.getBean(A.class);
	}
}
