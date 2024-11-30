package ru.tbank.education.school.lesson7

import java.time.LocalDate

/**
 * Моделька данных вклада. У одного пользователя может быть много вклад.
 * Доступны только рублевые вклад.
 */
data class Deposit(
    /**
     * Уникальный идентификатор вклада. Указан в договоре, поэтому не может меняться.
     */
    val id: Long,
    /**
     Начальный депозит в рублях. Последующее пополнение или частичное изъятие невозможно.
     */
    var initialDeposit: Int,
    /**
     * Дата открытия вклада.
     */
    val createAt: LocalDate,
    /**
     * Длительность вклада в месяцах.
     */
    var durationMonth: Int,
    /**
     * При начислении процентов на вклад в банк принято рассчитывать сложный процент. Смотри "капитализация вклада".
     * Капитализация происходит каждый день. Ставка в процентах, дроби процентов не допускаются.
     */
    val difProcent: Double,
    /**
     * Для премиальных клиентов банка на вклад в конце каждого месяца помимо процентов начисляется
     * вознаграждение 1% от суммы вклада.
     */
    val isVip: Boolean,
)
