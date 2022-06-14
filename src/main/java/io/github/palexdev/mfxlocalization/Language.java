package io.github.palexdev.mfxlocalization;

import java.util.Locale;

/**
 * Enumerator to list all the supported {@link Locale}s by MaterialFX.
 * <p>
 * Every {@code Language} enumeration is associated with a {@code Locale}.
 * <p>
 * The enumerator also specifies the project's default language, {@link #defaultLanguage()}.
 */
public enum Language {
	ARABIC(Locale.forLanguageTag("ar")),
	ENGLISH(Locale.ENGLISH),
	FRENCH(Locale.FRENCH),
	ITALIANO(Locale.ITALIAN),
	RUSSIAN(Locale.forLanguageTag("ru")),
	SIMPLIFIED_CHINESE(Locale.SIMPLIFIED_CHINESE),
	TRADITIONAL_CHINESE(Locale.TRADITIONAL_CHINESE);

	private final Locale locale;

	Language(Locale locale) {
		this.locale = locale;
	}

	/**
	 * @return the project's default language, {@link Language#ENGLISH}
	 */
	public static Language defaultLanguage() {
		return ENGLISH;
	}

	public Locale getLocale() {
		return locale;
	}
}
