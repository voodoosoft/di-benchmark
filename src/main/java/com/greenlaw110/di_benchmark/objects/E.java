package com.greenlaw110.di_benchmark.objects;

import java.util.Objects;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.drinkjava2.InjectBox;

@InjectBox(prototype = true) // for jBeanBox usage
@Component // for Spring usage
@Scope("prototype") // for Spring usage
public class E {
	public E() {
	}

	@Override
	public int hashCode() {
		return Objects.hashCode("e");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		return (obj instanceof E);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
