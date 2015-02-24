// Generated from /media/timur/EE286A072869CEE1/Work/SC/SCSTranslator/Grammars/scsNew.g4 by ANTLR 4.1
package net.ostis.scs.util.parsing.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link SCSNewVisitor}, which
 * can be extended to create a visitor which only needs to handle a subset of
 * the available methods.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class SCSNewBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements
SCSNewVisitor<T> {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitIdtf(@NotNull SCSNewParser.IdtfContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitIdtf_tuple(@NotNull SCSNewParser.Idtf_tupleContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitAttrs_list(@NotNull SCSNewParser.Attrs_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitSentence_level1(
			@NotNull SCSNewParser.Sentence_level1Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitSentence(@NotNull SCSNewParser.SentenceContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitSentence_internal_list(
			@NotNull SCSNewParser.Sentence_internal_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitAttrs_idtf_list(
			@NotNull SCSNewParser.Attrs_idtf_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitIdtf_level1(@NotNull SCSNewParser.Idtf_level1Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitSentence_level2_6(
			@NotNull SCSNewParser.Sentence_level2_6Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitSyntax(@NotNull SCSNewParser.SyntaxContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitSentence_internal(
			@NotNull SCSNewParser.Sentence_internalContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitAttr_sep(@NotNull SCSNewParser.Attr_sepContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitIdtf_edge(@NotNull SCSNewParser.Idtf_edgeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitSentence_assignment(
			@NotNull SCSNewParser.Sentence_assignmentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitIdtf_attrs(@NotNull SCSNewParser.Idtf_attrsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitIdtf_set(@NotNull SCSNewParser.Idtf_setContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public T visitIdtf_internal(@NotNull SCSNewParser.Idtf_internalContext ctx) {
		return visitChildren(ctx);
	}
}