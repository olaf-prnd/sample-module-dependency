package com.github.galcyurio.clipboard

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class ClipboardModule {
    @Singleton
    @Binds
    abstract fun bindClipboard(impl: ClipboardImpl): Clipboard
}
