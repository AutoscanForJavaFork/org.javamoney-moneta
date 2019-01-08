/**
 * Copyright (c) 2012, 2014, Credit Suisse (Anatole Tresch), Werner Keil and others by the @author tag.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.javamoney.moneta.spi;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Tests for {@link org.javamoney.moneta.spi.ConvertBigDecimal}.
 */
public class ConvertBigDecimalTest {

	private final BigDecimal expectValue = BigDecimal.TEN;

	@Test
	public void ofIntegerTest() {
		Assert.assertEquals(ConvertBigDecimal.of(10), expectValue);
	}

	@Test
	public void ofLongTest() {
		Assert.assertEquals(ConvertBigDecimal.of(10L), expectValue);
	}

	@Test
	public void ofShortTest() {
		Assert.assertEquals(ConvertBigDecimal.of((short) 10), expectValue);
	}

	@Test
	public void ofByteTest() {
		Assert.assertEquals(ConvertBigDecimal.of((byte) 10), expectValue);
	}

	@Test
	public void ofAtomicLongTest() {
		Assert.assertEquals(ConvertBigDecimal.of(new AtomicLong(10L)), expectValue);
	}

	@Test
	public void ofAtomicIntegerTest() {
		Assert.assertEquals(ConvertBigDecimal.of(new AtomicInteger(10)), expectValue);
	}

	@Test
	public void ofFloatTest() {
		Assert.assertEquals(ConvertBigDecimal.of(10f).setScale(0), expectValue);
	}

	@Test
	public void ofDoubleTest() {
		Assert.assertEquals(ConvertBigDecimal.of(10d).setScale(0), expectValue);
	}
	@Test
	public void ofDefaultNumberValueTest() {
		Assert.assertEquals(ConvertBigDecimal.of(new DefaultNumberValue(10)).setScale(0), expectValue);
	}
	@Test
	public void ofBigIntegerTest() {
		Assert.assertEquals(ConvertBigDecimal.of(BigInteger.valueOf(10L)), expectValue);
	}
}
